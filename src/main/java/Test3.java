import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmy on 2017/12/20
 */
public class Test3 {

    public static void main(String[] args) {

        User u1 = new User("11");
        User u2 = new User("22");
        User u3 = new User("22");

        List<User> list1 = new ArrayList<>();
        list1.add(u1);
        list1.add(u2);

        List<User> list2 = new ArrayList<>();
        list2.add(u1);
        list2.add(u3);

        System.out.println(list1.containsAll(list2));
    }

    public static class User{
        private String name;

        public User(String name) {
            this.name = name;
        }
    }

}
