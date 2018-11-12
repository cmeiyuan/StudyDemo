/**
 * Created by cmy on 2017/11/13
 */
public class View {

    private Callback callback;

    public Callback getCallback() {
        return callback;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void perform() {
        if (callback != null) {
            callback.onCall();
        }
    }
}
