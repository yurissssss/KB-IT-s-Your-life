package ch04.exam;

public class TriangleReverse {
    public static void main(String[] args) {
        //열
        for (int i=5; i>0; i--) {
            //행
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
