import java.util.Scanner;
public class Maxnumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the number");

        // Fixing the typo here
        Scanner sc = new Scanner(System.in);
        
        int a = 10, b = 20, c = 15, max;

        // Correcting the ternary logic to find the max
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        // Fixed the print statement and added proper spacing
        System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
    }
}




OUTPUT:
Maximum number among 10, 20 and 15 is 20


DESCRIPTION:
This Java program finds the maximum of three integers (10, 20, and 15) using a nested ternary operator. 
The result is then displayed, showing the maximum number among the three variables.


