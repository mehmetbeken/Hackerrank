package javaloops2;

public class JavaLoops2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int n = 5;


        double math = 0;
        for (int j = 1; j <= n; j++) {
            math = (math + ((int) Math.pow(2, j - 1) * b));
            System.out.print(a + (int) math + " ");
        }
        System.out.println();


    }
}
