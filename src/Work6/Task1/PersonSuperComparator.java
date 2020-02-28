package Work6.Task1;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    Person rep = new Person(1, "Ae");
    Person per = new Person(1, "Ae");

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == o2.getAge() && o1.getName() == o2.getName()) {
            System.out.println("Верны");
        } else {
            System.out.println("Не верны");
        }
        return 0;
    }
}

