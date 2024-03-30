public class Employee {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    public Employee (String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info_employee () {
        System.out.println("ФИО: " + fio + "; должность: " + position + "; электронная почта: " +
                email + "; телефон: " + phone + "; зарплата: " + salary + "; возраст: " + age);
    }
}
