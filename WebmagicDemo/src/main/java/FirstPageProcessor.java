import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

/**
 * Created by seentech on 2017/2/6.
 */
public class FirstPageProcessor implements PageProcessor {

    // 抓取网站相关配置
    private Site site = Site.me().setTimeOut(10000).setRetryTimes(3).setSleepTime(1000).setCharset("UTF-8");

    @Override
    public Site getSite() {
        return site;
    }

    /**
     * 核心抽取逻辑:获取页面中信息部分
     */
    @Override
    public void process(Page page) {
        System.out.println("Requesting: " + page.getUrl());

        /**
         * 获取首页中每个文章信息部分,F12调试下,可直接Copy XPath
         */
        List<String> list = page.getHtml().xpath("/html/body/section[2]/div[1]/div[1]/ol/li").all();

        for(String header : list){
            Html tmp = Html.create(header);
//			System.out.println(tmp);

            //文章标题:相对的XPath,用class属性识别
            System.out.println(tmp.xpath("//h3[@class='repo-list-name']/a/text()").toString());
            //文章引用:相对的XPath,用class属性识别
            System.out.println(tmp.xpath("//h3[@class='repo-list-name']/a/@href").toString());
            //文章分类:相对的XPath,直接Copy XPath
            System.out.println(tmp.xpath("//p[2]/span[2]/a/text()").toString());
            System.out.println("------------------------------");
        }

        if (list.size() <=0) {
            // 忽略这个页面
            page.setSkip(true);
        }
        //从页面发现后续的url地址来抓取
//		page.addTargetRequests(page.getHtml().links().regex("(https://www.zifangsky.cn/page/\\d*)").all());

    }

    public static void main(String[] args) {

        Spider.create(new FirstPageProcessor())
                .addUrl("http://triangleidea.com")
                .thread(5)
                .run();
    }
}
