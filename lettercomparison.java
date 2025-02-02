import java.util.Scanner;

 class lettercomparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first letter: ");
        char letterA = scanner.next().charAt(0);

        System.out.print("Enter the second letter: ");
        char letterB = scanner.next().charAt(0);

        System.out.println("\nComparison Results:");
        System.out.println("letterA < letterB: " + (letterA < letterB));
        System.out.println("letterA <= letterB: " + (letterA <= letterB));
        System.out.println("letterA > letterB: " + (letterA > letterB));
        System.out.println("letterA >= letterB: " + (letterA >= letterB));
        System.out.println("letterA == letterB: " + (letterA == letterB));
        System.out.println("letterA != letterB: " + (letterA != letterB));

        scanner.close();
    }
}

OUTPUT:
Enter the first letter: A
Enter the second letter: B

Comparison Results:
letterA < letterB: true
letterA <= letterB: true
letterA > letterB: false
letterA >= letterB: false
letterA == letterB: false
letterA != letterB: true

DESCRIPTION:
The program compares two user-input letters (letterA and letterB) using relational operators (<, <=, >, >=, ==, !=) to determine their relative values based on their Unicode values. 
It prints the results of these comparisons.
