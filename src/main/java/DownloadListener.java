/**
 * Created by cmy on 2018/11/10
 */

/**
 * 下载监听器
 */
public interface DownloadListener {

    void onSuccess(String path);

    void onFailure(Exception e);

}
