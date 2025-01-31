import java.util.Scanner;
public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		System.out.println("Enter the character:");
		Scanner sc = new Scanner(System.in); 

		char a = sc.next().charAt(0);

		if(a=='a'||a=='e'|| a=='i'|| a=='o'||a=='u'||a=='A'||a=='E'|| a=='I'|| a=='O'|| a=='U')
		{
		System.out.println("The vowels");
		}
		else{
		System.out.println("The consonant");
		}
		
	}

}
OUTPUT:
Enter the character:
S
The consonant

Enter the character:
U
The vowels


DESCRIPTION:
This Java program checks whether the entered character is a vowel or a consonant.
It prompts the user to input a character and then uses an if-else statement to determine if it's a vowel .
The result is printed accordingly, either "The vowels" or "The consonant".

