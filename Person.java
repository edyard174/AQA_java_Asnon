public class Person {
    String name;
    String post;
    String email;
    String phone;
    int wage;
    int age;
    Person(String name, String post, String email, String phone, int wage, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }
    public  void info() {
        System.out.println("name: \"" + name + "\"\npost: \"" + post + "\"\nemail: \""
                + email + "\"\nphone: \"" + phone + "\"\nwage: \"" + wage
                + "\"\nage: \"" + age + "\"\n");
    }
}
