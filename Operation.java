import java.util.Scanner;
public class operation {
	public static void main(String[] args) {
		java.util.Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		System.out.println("Enter the choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice = Sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Result:"+(a+b));
			break;
			case 2:
				System.out.println("Result:"+(a-b));
				break;
			case 3:
				System.out.println("Result:"+(a*b));
				break;
			case 4:
				System.out.println("Result:"+(a/b));
				break;
			default:
			
				System.out.println("Invalid choice");
				break;
			
			
			
		}
	}

}
OUTPUT:
Enter the number
10
5
Enter the choice
1.Addition
2.Subtraction
3.Multiplication
4.Division
1
Result:15

Enter the number
10
5
Enter the choice
1.Addition
2.Subtraction
3.Multiplication
4.Division
2
Result:5

Enter the number
10
5
Enter the choice
1.Addition
2.Subtraction
3.Multiplication
4.Division
3
Result:50

Enter the number
10
5
Enter the choice
1.Addition
2.Subtraction
3.Multiplication
4.Division
4
Result:2


DESCRIPTION:
This Java program allows the user to input two numbers and choose a mathematical operation (addition, subtraction, multiplication, or division).
Based on the user's choice, the program performs the corresponding operation and displays the result. If the user enters an invalid choice.
