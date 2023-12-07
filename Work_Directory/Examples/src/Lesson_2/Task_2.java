package Lesson_2;

public class Task_2 {
    public static void main(String[] args) {
        new MyClass("Hello");
    }
}
class MyClass {
    MyClass(String s){
        this(10);
        System.out.println(s);
    }
    MyClass(int i){
        this(true);
        System.out.println(i);
    }
    MyClass(boolean b){
        System.out.println(b);
    }
}