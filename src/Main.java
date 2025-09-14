import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person [] people ={
                new Person(11,"Maria"),
                new Person(23,"Sara"),
                new Person(45,"Bob"),
                new Person(55,"Kira"),

        };
        Arrays.sort(people, Comparator.comparingInt(person -> person.age));

        // Выводим отсортированный массив
        System.out.println(Arrays.toString(people));
    }
}