package Lesson_2;

public class Task_1 {
    public static void main(String[] args) {
        SomeThingClass someThingClass = new SomeThingClass();
        someThingClass.stay();
    }
}
class SomeThingClass {
    public void stay() {
        System.out.println("stay");
        this.sit();
        sit();
    }
    public void sit() {
        System.out.println("Im Sit");
    }
}