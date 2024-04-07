public class Dish {
    private int food;

    public Dish(int food){
        this.food = food;
    }

    public void addEat(int x){
        food = food + x;
        System.out.println("В миску добавили еды: " + x);
    }
    public boolean notEnoughFood(int count){
        if(food >= count){
           food = food - count;
           return true;
        }
        return false;
    }

}
