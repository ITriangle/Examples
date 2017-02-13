package Normal;

/**
 * Created by seentech on 2017/2/7.
 */
public class UserResponse {
    private int code;
    private String message;
    private User data;

    public UserResponse(int code, String message, User data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public User getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Normal.UserResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
