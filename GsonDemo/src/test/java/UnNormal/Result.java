package UnNormal;

import java.util.Map;

/**
 * Created by seentech on 2017/2/13.
 */
public class Result {


    private Map<String,FutureDay> future;

    public Map<String, FutureDay> getFuture() {
        return future;
    }

    public void setFuture(Map<String, FutureDay> future) {
        this.future = future;
    }

    @Override
    public String toString() {
        return "Result{" +
                "future=" + future +
                '}';
    }
}
