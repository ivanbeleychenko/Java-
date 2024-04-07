public class Cat extends Animal {
    private int runLimitCat = 200;
    private boolean satiety;
    private int appetite = 80;
    private static int count = 0;
    public Cat(String name, boolean satiety) {
        super(name);
        this.satiety = satiety;
        count++;
    }
    public void runCat(int distance) {
        if (distance <= runLimitCat) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать "+ distance + "м.");
        }
    }
    public void swimCat(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
    public void eat(Dish dish) {
        if (satiety == false && dish.notEnoughFood(appetite) == true) {
            System.out.println(name + " поел:)");
            satiety = true;
        } else if (dish.notEnoughFood(appetite) == false) {
            System.out.println(name + " не поел, " +
                    "в миске недостаточно еды.");
        }
    }
    public static int getCount(){
        return count;
    }
}
