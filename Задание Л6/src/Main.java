import java.util.Arrays;
public class Main {
    public static void main  (String[] args) {
        //Задание 1
        Employee emp = new Employee("Chelik Chelikov", "Engineer", "caca@mail.ru",
                34_626_626, 30000, 28);
        System.out.println("Задание 1");
        emp.info_employee();

        //Задание2
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Serega Sergeev", "intern", "serdriv@mail.ru",
                34_345_5667, 29000, 30  );
        empArray[1] = new Employee("Inna Ivanova ", "assistant", "Inna@mail.ru",
                34_435_5747, 25000, 25  );
        empArray[2] = new Employee("Oskar Duso ", "developer", "dus@mail.ru",
                34_565_5477, 40000, 31  );
        empArray[3] = new Employee("Igor Ivanov ", "developer", "Inna@mail.ru",
                34_895_5477, 40000, 29  );
        empArray[4] = new Employee("Old Man Hotabych ", "Chief Analyst", "Hotabych@mail.ru",
                34_310_5367, 60000, 70  );

        // Вывод массива в консоль
        /*System.out.println("Задание 2");
        for (int i = 0; i < 5 ; i++ ) {
            empArray[i].info_employee();
        }*/

        //Задание3
        Park.Attractions attractions = new Park().new Attractions("Колесо обозрения","08:00",
                "18:00", 500);
        System.out.println("Задание 3");
        attractions.info_park();
    }
}

