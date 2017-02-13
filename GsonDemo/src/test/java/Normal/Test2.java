package Normal;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by seentech on 2017/2/7.
 */
public class Test2 {

    @Test
    public void userResponseFromJson() {
        Gson gson = new Gson();

        String urJson = "{\"code\":\"0\",\"message\":\"success\",\"data\":{\"name\":\"wangl\",\"age\":24,\"email\":\"wangl@163.com\"}}";
        UserResponse userResponse = gson.fromJson(urJson, UserResponse.class);
        User user = userResponse.getData();

        System.out.println(userResponse);
        System.out.println(user);
    }

    @Test
    public void userResponseToJson() {
        Gson gson = new Gson();

        User user = new User("wangl", 24, "wangl@163.com");
        UserResponse userResponse = new UserResponse(0, "success", user);

        String urJson = gson.toJson(userResponse);

        System.out.println(urJson);
    }


    /**
     * 不适用泛型,定义两种对象
     */
    @Test
    public void noResultFromJson() {
        Gson gson = new Gson();

        String urJson1 = "{\"code\":\"0\",\"message\":\"success\",\"data\":{\"name\":\"wangl\",\"age\":24,\"email\":\"wangl@163.com\"}}";

        UserResponse userResponse = gson.fromJson(urJson1, UserResponse.class);
        User user = userResponse.getData();
        System.out.println(user);


        String urJson2 = "{\"code\":\"0\",\"message\":\"success\",\"data\":[{\"name\":\"wangl\",\"age\":24,\"email\":\"caiy@163.com\"},{\"name\":\"caiy\",\"age\":23,\"email\":\"caiy@163.com\"}]}";
        UserListResponse userListResponse = gson.fromJson(urJson2, UserListResponse.class);
        List<User> list = userListResponse.getData();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    /**
     * 使用泛型,定义一种对象,用泛型代替改变的数据部分
     */
    @Test
    public void resultFromJson() {
        Gson gson = new Gson();

        String urJson1 = "{\"code\":\"0\",\"message\":\"success\",\"data\":{\"name\":\"wangl\",\"age\":24,\"email\":\"wangl@163.com\"}}";

        Type userType = new TypeToken<Result<User>>(){}.getType();
        Result<User> userResult = gson.fromJson(urJson1, userType);
        System.out.println(userResult);

        String urJson2 = "{\"code\":\"0\",\"message\":\"success\",\"data\":[{\"name\":\"wangl\",\"age\":24,\"email\":\"caiy@163.com\"},{\"name\":\"caiy\",\"age\":23,\"email\":\"caiy@163.com\"}]}";
        Type listusrType = new TypeToken<Result<List<User>>>(){}.getType();
        Result<List<User>> listResult = gson.fromJson(urJson2, listusrType);

        System.out.println(listResult);

    }

}
