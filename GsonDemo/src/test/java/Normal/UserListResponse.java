package Normal;

import java.util.List;

/**
 * Created by seentech on 2017/2/7.
 */
public class UserListResponse {
    private int code;
    private String message;
    private List<User> data;

    public List<User> getData() {
        return data;
    }
}
