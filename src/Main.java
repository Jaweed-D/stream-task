import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//1-ci task
        var result = new ArrayList<Integer>();
        List.of(1, 2, 3, 4, 5)
                .stream()
                .map(s -> s*s)
                .forEach(result::add);
        System.out.println(result);

//2-ci task

        boolean check = List.of(1, 2, 3, 4, 5)
                .stream()
                .allMatch(p -> p % 2 == 0);
        if (check) {
            System.out.println("Bütün ədədlər cütdür");
        } else {
            System.out.println("Bütün ədədlər cüt deyil");
        }

//3-cu task
        var names = new ArrayList<String>();
        List.of(new User("Cavid","Dashdamirli",26),
        new User("Elchin","Mammadov",19),
                new User("Oqtay","Yusifov",42),
                new User ("Elvin","Hasanov",34))
            .stream()
                .filter(a -> a.getAge()>20)
                .map(a->a.getName().toUpperCase())
                .forEach(names::add);
        System.out.println(names);

//4-cu task
        List.of(new User("Cavid","Dashdamirli",26),
                new User("Elchin","Mammadov",19),
                new User("Oqtay","Yusifov",42),
                new User ("Elvin","Hasanov",34))
                .stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);

//5-ci task
        var sumSalary = List.of(new Employee(1, "Anar", "IT", 3500, 25),
                new Employee(2, "Leyla", "HR", 2200, 30),
                new Employee(2, "Leyla", "IT", 2600, 33))
                .stream()
                .filter(a -> a.getDepartment().equals("IT"))
                .map(Employee::getSalary)
                .reduce(0,Integer::sum);
        System.out.println("Total salary: "+sumSalary);

//6-ci task
        List.of(new Employee(1, "Anar", "IT", 3500, 25),
                        new Employee(2, "Leyla", "HR", 3200, 30),
                        new Employee(2, "Leyla", "IT", 3600, 33))
                .stream()
                .filter(a-> a.getSalary()>3000)
                .map(Employee::getDepartment)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

//7-ci task
        List.of(new Employee(1, "Anar", "IT", 3500, 25),
                        new Employee(2, "Leyla", "HR", 3200, 30),
                        new Employee(2, "Leyla", "IT", 3600, 33))
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getFirstName)
                .ifPresent(System.out::println);



//8-ci task


    }
}
