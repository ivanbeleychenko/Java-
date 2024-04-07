public class Dog extends Animal{
    private int runLimitDog = 500;
    private int swimLimitDog = 10;
    private static int count = 0;
    public Dog(String name) {
        super(name);
        count++;
    }
    void runDog(int distance) {
        if (distance <= runLimitDog) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать "+ distance + "м.");
        }
    }
    public void swimDog(int distance) {
        if (distance <= swimLimitDog){
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть "+ distance + "м. ");
        }
    }
    public static int getCount(){
        return count;
    }
}
