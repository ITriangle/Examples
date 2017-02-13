package Normal;

/**
 * Created by seentech on 2017/2/7.
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

    @Override
    public String toString() {
        return "Normal.Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
