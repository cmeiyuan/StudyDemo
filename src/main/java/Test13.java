/**
 * Created by cmy on 2018/8/20
 */
public class Test13 {

    public static void main(String[] args) {

        System.out.println(SubClass.value);

    }

    public static class SuperClass {

        public static int value = 123;

        static {
            System.out.println("SuperClass init");
        }

    }

    public static class SubClass extends SuperClass {

        static {
            System.out.println("SubClass init");
        }

    }

}
