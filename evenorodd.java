import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner out= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = out.nextInt();
        if (n%2 == 0) {
            System.out.println(n+"It is even");
        } 
        else {
            System.out.println(n+"It is odd");
        }
        out.close();
    }
}
