package ch05.exam;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = 0;

        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("최대값 : " + max);
    }
}
