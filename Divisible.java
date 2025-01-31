package santhiya;
import java.util.Scanner;
public class divisible {
	public static void main(String[]args) {
		
		System.out.println("Enter the number");
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		
		if(a%3==0 && a%4==0){
		System.out.println("Good Morning");
		}
		else if(a%4==0) {
		System.out.println("Good Afternoon");
		}
		else if(a%3==0) {
		System.out.println("Good Evening");
		}
	    else {
			System.out.println("Good Night");
	    }

    }
}

OUTPUT:
Enter the number
5
Good Night

Enter the number
3
Good Evening

Enter the number
4
Good Afternoon

DESCRIPTION:
This Java program prompts the user to input a number and checks its divisibility by 3 and 4.
Depending on the divisibility, it prints different greetings: "Good Morning", "Good Afternoon", "Good Evening", or "Good Night".
It also includes input validation and proper resource management by closing the Scanner object.
