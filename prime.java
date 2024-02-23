import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n = we.nextInt();

        if(n%2==0){
            System.out.println(n+" is not a prime number");
        }else{
            System.out.println(n+" is a prime number");
        }

        we.close();
    }
}