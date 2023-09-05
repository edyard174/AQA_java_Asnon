public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov@mai.ru", "89000112233", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Programmer", "petrov@mail.ru", "89998967453", 100000, 41);
        persArray[2] = new Person("Ivanova Sveta", "Booker", "ivanova@mail/ru", "89228545678", 40000, 32);
        persArray[3] = new Person("Sidarov Sergey", "Manager", "sidarov@mail.ru", "89505088899", 50000, 42);
        persArray[4] = new Person("Sidorova Yana", "Barber", "sidorova@mail.ru", "89778901234", 35000, 45);
        for (Person pers: persArray) {
            if (pers.age > 40) {
                pers.info();
            }
        }
        Park.Price a = new Park().new Price();
    }
}