import com.android.build.gradle.api.ApplicationVariant;
import com.android.build.gradle.internal.api.ApplicationVariantImpl;

import java.io.File;

/**
 * Created by cmy on 2017/11/22
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(("ANDROID_SDK_HOME: " + System.getProperty("ANDROID_SDK_HOME")));
        System.out.println( "ANDROID_SDK_HOME: " + System.getenv("ANDROID_SDK_HOME"));
        System.out.println( "TEST_TMPDIR: " + System.getProperty("TEST_TMPDIR"));
        System.out.println( "TEST_TMPDIR: " + System.getenv("TEST_TMPDIR"));
        System.out.println( "user.home: " + System.getProperty("user.home"));
        System.out.println( "user.home: " + System.getenv("user.home"));
        System.out.println( "HOME: " + System.getProperty("HOME"));
        System.out.println( "HOME: " + System.getenv("HOME"));
    }

}
