import java.lang.System;
public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

}

