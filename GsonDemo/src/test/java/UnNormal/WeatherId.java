package UnNormal;

/**
 * Created by seentech on 2017/2/13.
 */
public class WeatherId {
    private String fa;
    private String fb;

    @Override
    public String toString() {
        return "WeatherId{" +
                "fa='" + fa + '\'' +
                ", fb='" + fb + '\'' +
                '}';
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }
}
