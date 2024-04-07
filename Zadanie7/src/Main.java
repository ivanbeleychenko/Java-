public class Main {
    public static void main(String[] args) {


        // Задание1
        Cat cat1 = new Cat("Федя", false);
        Cat cat2 = new Cat("Кузя", false);
        Cat cat3 = new Cat("Компот", false);
        Cat cat4 = new Cat("Гараж", false);
        Cat[] cats = {cat1,cat2,cat3,cat4};
        Dish dish = new Dish(300);

        for(int i = 0; i < 4; i++){
            cats[i].eat(dish);
        }
        cat4.runCat(220);
        dish.addEat(100);
        cat4.eat(dish);
        cat4.runCat(100);
        cat1.runCat(100);
        cat2.swimCat(10);
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Тумблер");
        dog1.runDog(400);
        dog2.swimDog(12);

        System.out.println("Создано котов: "+ Cat.getCount());
        System.out.println("Создано собак: "+ Dog.getCount());
        System.out.println("Создано животных: "+ (Cat.getCount()+Dog.getCount()));

        // Задание2
        Triangle triangle = new Triangle(2,5,4, "Красный", "Синий");
        System.out.println("Треугольник:");
        System.out.println("периметр = "+ triangle.perimeter()+ ", площадь = " + triangle.square() +
                ", цвет фона: " + triangle.getFillColor() + ", цвет границ: " + triangle.getBorderColor());
        Rectangle rectangle = new Rectangle(3,2.5, "Фиолетовый", "Чёрный");
        System.out.println("Прямоугольник:");
        System.out.println("периметр = "+ rectangle.perimeter()+ ", площадь = " + rectangle.square() +
                ", цвет фона: " + rectangle.getFillColor() + ", цвет границ: " + rectangle.getBorderColor());
        Round round = new Round(4, "Розовый", "Жёлтый");
        System.out.println("Круг:");
        System.out.println("периметр = "+ round.perimeter()+ ", площадь = " + round.square() +
                ", цвет фона: " + round.getFillColor() + ", цвет границ: " + round.getBorderColor());


    }


}
