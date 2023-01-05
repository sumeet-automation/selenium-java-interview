import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        Person sumeet1 = new Person("Sumeet", "Agrawal", 28);
        Person sumeet2 = new Person("Sumeet", "Agrawal", 28);
        System.out.println(sumeet2 == sumeet1);
        Person vaibhav = new Person("Vaibhav", "Agrawal", 28);
        System.out.println(sumeet1.hashCode());
        System.out.println(sumeet2.hashCode());
        System.out.println(vaibhav.hashCode());
        List<Person> list = new ArrayList<>();
        list.add(sumeet1);
        list.add(sumeet2);
        list.add(vaibhav);
        //list.add(sumeet2);
        System.out.println(sumeet1 == sumeet2);
        System.out.println(sumeet1.equals(sumeet2));
        System.out.println(list.size());

        Person person4 = new Person("S", "A", 28);
        System.out.println(person4.equals(sumeet1));
        System.out.println(list.contains(person4));

        List<String> list1 = new ArrayList<>();
        String s1 = "Sumeet";
        list1.add(s1);
        String s2 = "Sumeet";
        list1.contains(s2);
    }
}
