import java.util.Scanner;

public class Basic {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            int m = n;

            int rev = 0, r;

            while(n>0){
                r = n%10;
                rev = rev*10+r;
                n/=10;
            }
            if(rev == m){
            System.out.print("It is a palindrome");
            } else {
                System.out.println("It is not a palindrome");
            }
        }
    }
}
