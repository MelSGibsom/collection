package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 30.05.2015.
 */
public class LearnCollectn {
    public static void main(String args[]){
        List<String> cars = new ArrayList<String>();

        cars.add("Запоршивец");
        cars.add("Волга");

        System.out.println(cars);
        List<User> users = new ArrayList<User>();
        User user1 = new User("Руслан", "0571231235");
        User user2 = new User("Антон", "06678945497");
        User user3 = new User("Дормедонт Петрович", "0333555777");
        users.add(user1);
        users.add(user2);
        System.out.println(users);
        System.out.println(users.contains(user1));
        System.out.println(users.contains(user2));
        System.out.println(users.contains(user3));


        //System.out.println(users.contains(user1));
        System.out.println(users.toArray());
    }
}
