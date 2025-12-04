import java.util.List;

public class StreamDemo {

    public static void Demo() {

        List<Person> persons = List.of(
                new Person("Martin", 28, Sex.Male),
                new Person("Anna", 48, Sex.Female),
                new Person("Tintin", 7, Sex.Other),
                new Person("Lotta", 9, Sex.Female),
                new Person("Per-Åke", 68, Sex.Male)
        );

        // Alla men
        persons.stream()
                .filter( p -> p.getSex() == Sex.Male )
                .forEach(System.out::println);

        // Alla Kvinnor över 30
        List<Person> femaleOver30 = persons.stream()
                .filter(p -> p.getSex() == Sex.Female && p.getAge() > 30)
                .toList();
        System.out.println(femaleOver30);

        // Endast ålder (int), icke men, sorterad
        List<Integer> sortedAge = persons.stream()
                .filter(p -> p.getSex() != Sex.Male)
                .map( p -> p.getAge() )
                .sorted()
                .toList();
        System.out.println(sortedAge);

    }

}

enum Sex {
    Male,
    Female,
    Other
};

class Person {

    String name;
    Integer age;
    Sex sex;

    public Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
