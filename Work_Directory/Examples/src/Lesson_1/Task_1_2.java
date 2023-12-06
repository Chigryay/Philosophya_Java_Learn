package Lesson_1;

public class Task_1_2 {
    public static void main(String[] args) {
        System.out.println(test(0, 10, 4));
        System.out.println(test(8, 12, 14));
        System.out.println(test(-1, 10, -2));
    }
    static int test(int begin, int end, int testVal) {
        if (testVal >= begin && testVal <= end) return 0;
        else if (testVal > end) return 1;
        else return -1;
    }
}
