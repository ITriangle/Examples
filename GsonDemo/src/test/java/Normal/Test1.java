package Normal;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by seentech on 2017/2/7.
 */
public class Test1 {

    @Test
    public void basicTypeFromJson(){
        Gson gson =  new Gson();
        int i = gson.fromJson("100", int.class);
        double d = gson.fromJson("\"99.99\"", double.class);
        boolean b = gson.fromJson("true",boolean.class);
        String str = gson.fromJson("String",String.class);

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(str);

    }

    @Test
    public void basicTypeToJson(){
        Gson gson = new Gson();
        String jsonNumber = gson.toJson(100);
        String jsonBoolean = gson.toJson(false);
        String jsonString = gson.toJson("String");

        System.out.println(jsonNumber);
        System.out.println(jsonBoolean);
        System.out.println(jsonString);

    }

    @Test
    public void POJOtoJson(){
        Gson gson = new Gson();

        User user = new User("wangl",24,"wangl@163.com");
        String jsonObject = gson.toJson(user);

        System.out.println(jsonObject);
    }

    @Test
    public void POJOfromJson(){
        Gson gson = new Gson();

        String jsonObect = "{\"name\":\"wangl\",\"age\":24,\"email\":\"wangl@163.com\"}";

        User user = gson.fromJson(jsonObect,User.class);

        System.out.println(user.toString());
    }


    @Test
    public void arrayJson() {
        Gson gson = new Gson();

        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";

        /**
         * 直接使用 string 数组
         */
        String[] strings = gson.fromJson(jsonArray, String[].class);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        /**
         * 使用 List 保存,需要用 type 类型获取方法
         */
        Type typeToken = new TypeToken<List<String>>(){}.getType();
        List<String> stringList = gson.fromJson(jsonArray, typeToken);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

}
