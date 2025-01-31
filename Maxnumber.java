import java.util.Scanner;
public class Maxnumber {
    public static void main(String[] args) {
        
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 20, c = 15, max;
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
    }
}




OUTPUT:
Maximum number among 10, 20 and 15 is 20


DESCRIPTION:
This Java program finds the maximum of three integers (10, 20, and 15) using a nested ternary operator. 
The result is then displayed, showing the maximum number among the three variables.


