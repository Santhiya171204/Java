import java.util.Scanner;

 class mysteriousnumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first mysterious number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second mysterious number: ");
        int num2 = scanner.nextInt();

        
        if (num1 > num2) {
            System.out.println("The first mysterious number (" + num1 + ") is bigger.");
        } else if (num2 > num1) {
            System.out.println("The second mysterious number (" + num2 + ") is bigger.");
        } else {
            System.out.println("Both mysterious numbers are equal.");
        }

       
        scanner.close();
    }
}

OUTPUT:
Enter the first mysterious number: 600
Enter the second mysterious number: 500
The first mysterious number (600) is bigger.

Enter the first mysterious number: 11
Enter the second mysterious number: 12
The second mysterious number (12) is bigger.

Enter the first mysterious number: 11
Enter the second mysterious number: 11
Both mysterious numbers are equal.


DESCRIPTION:
The MysteriousNumber program compares two input numbers and determines which one is greater. 
It uses basic conditional statements (if-else) to check if the first number is larger, the second one is larger, or if both numbers are equal. 
