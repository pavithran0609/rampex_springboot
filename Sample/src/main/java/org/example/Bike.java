package org.example;

public class Bike {
   /* private int age;
    private int Roll;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ride(){
        System.out.println("get Bike");
    }
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void work(){
        engine.startEngine();
    }*/
    private Vehicle v;

    public void setV(Vehicle v) {
        this.v = v;
    }
    public void work(){
        v.move();
    }
}
