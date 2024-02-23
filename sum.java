import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);

        System.out.println("Enter value for a");
        int a = sn.nextInt();
        System.out.println("Enter value for b");
        int b = sn.nextInt();
        System.out.println("Sum of a + b = " + (a+b));

        sn.close();
    }
}
