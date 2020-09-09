public class Staff {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    protected int age;

    public Staff(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("name: " + name + "; position: " + position + "; email: " + email + "; phone number: "
                + phoneNumber + "; salary: " + salary + "; age: " + age );
    }

    public static void main(String[] args) {
        Staff staff1 = new Staff("Egor", "ingineer", "ab@a.ru", "8924115151", 50000, 22);
        staff1.info();
    }



}
