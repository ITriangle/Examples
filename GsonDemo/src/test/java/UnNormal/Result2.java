package UnNormal;

import java.util.Map;

/**
 * Created by seentech on 2017/2/13.
 */
public class Result2 {

    private Map<String,Object> future;

    public Map<String, Object> getFuture() {
        return future;
    }

    public void setFuture(Map<String, Object> future) {
        this.future = future;
    }

    @Override
    public String toString() {
        return "Result2{" +
                "future=" + future +
                '}';
    }
}
