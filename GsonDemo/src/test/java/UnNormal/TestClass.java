package UnNormal;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.Map;

/**
 * Created by seentech on 2017/2/13.
 */
public class TestClass {

    /**
     {"resultcode":"200","reason":"successed!","result":{"future":{"day_20151002":{"temperature":"19℃~29℃","weather":"多云","WeatherId":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期五","date":"20151002"},"day_20151003":{"temperature":"20℃~30℃","weather":"多云","WeatherId":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期六","date":"20151003"},"day_20151004":{"temperature":"22℃~30℃","weather":"多云转阵雨","WeatherId":{"fa":"01","fb":"03"},"wind":"北风微风","week":"星期日","date":"20151004"},"day_20151005":{"temperature":"21℃~27℃","weather":"阵雨","WeatherId":{"fa":"03","fb":"03"},"wind":"北风微风","week":"星期一","date":"20151005"},"day_20151006":{"temperature":"21℃~28℃","weather":"阵雨","WeatherId":{"fa":"03","fb":"03"},"wind":"北风微风","week":"星期二","date":"20151006"},"day_20151007":{"temperature":"21℃~28℃","weather":"阵雨","WeatherId":{"fa":"03","fb":"03"},"wind":"北风微风","week":"星期三","date":"20151007"},"day_20151008":{"temperature":"21℃~28℃","weather":"阵雨","WeatherId":{"fa":"03","fb":"03"},"wind":"北风微风","week":"星期四","date":"20151008"}}},"error_code":0}
     *
     */

    @Test
    public  void test(){
        String jsondata = "{\"result\":{\"future\":{\"day_20151002\":{\"temperature\":\"19℃~29℃\",\"weather\":\"多云\",\"WeatherId\":{\"fa\":\"01\",\"fb\":\"01\"},\"wind\":\"北风微风\",\"week\":\"星期五\",\"date\":\"20151002\"},\"day_20151003\":{\"temperature\":\"20℃~30℃\",\"weather\":\"多云\",\"WeatherId\":{\"fa\":\"01\",\"fb\":\"01\"},\"wind\":\"北风微风\",\"week\":\"星期六\",\"date\":\"20151003\"}}}}";


        Gson gson = new Gson();

        Response response = gson.fromJson(jsondata, Response.class);

        System.out.println(response.toString());

        Map<String, FutureDay> futureDayMap = response.getResult().getFuture();

        for (String key: futureDayMap.keySet()) {
            System.out.println("key: " + key);
            System.out.println(futureDayMap.get(key).toString());
        }



    }


    @Test
    public void test2(){
        String jsondata = "{\"result\": {\"future\": {\"weather_id\": {\"fa\": \"01\",\"fb\": \"02\"},\"day_20151002\": {\"temperature\": \"19℃~29℃\",\"weather\": \"多云\",\"wind\": \"北风微风\",\"week\": \"星期五\",\"date\": \"20151002\"},\"day_20151003\": {\"temperature\": \"20℃~30℃\",\"weather\": \"多云\",\"wind\": \"北风微风\",\"week\": \"星期六\",\"date\": \"20151003\"}}}}";

        Gson gson  = new Gson();

        Response2 response = gson.fromJson(jsondata, Response2.class);

        System.out.println(response.toString());

        Map<String, Object> objectMap = response.getResult().getFuture();

        for (String key: objectMap.keySet()) {
            System.out.println("key: " + key);
            System.out.println(objectMap.get(key).toString());
        }
    }
}
