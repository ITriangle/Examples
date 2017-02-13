package UnNormal;

/**
 * Created by seentech on 2017/2/13.
 */
public class Response2 {
    private String resultcode;
    private String reason;
    private String error_code;
    private Result2 result;

    @Override
    public String toString() {
        return "Response2{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", error_code='" + error_code + '\'' +
                ", result=" + result +
                '}';
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public Result2 getResult() {
        return result;
    }

    public void setResult(Result2 result) {
        this.result = result;
    }
}
