package src.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Sex.MAN),
                new Student("Максим", 20, Sex.MAN),
                new Student("Екатерина", 20, Sex.WOMAN),
                new Student("Михаил", 28, Sex.MAN)
        );
        System.out.println("Ex 4:");
        System.out.println("Средний возраст студентов мужского пола: " + students.stream()
                .filter(x -> x.getGender()==Sex.MAN)
                .reduce(0, (a, b) -> a + b.getAge(), (a, b) -> a + b)
                /students.stream().filter(x -> x.getGender()==Sex.MAN).count());
        System.out.println("В этои году повестка придет: " + students.stream().
                filter(x -> x.getAge() > 18 && x.getAge() < 27 && x.getGender() == Sex.MAN)
                .collect(Collectors.toList()));
    }
}
class Student {
    private String name;
    private Integer age;
    private Sex gender;

    Student(String name, Integer age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    public Sex getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.getName()) &&
                Objects.equals(age, student.getAge()) &&
                Objects.equals(gender, student.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
enum Sex{
    MAN,
    WOMAN
}


