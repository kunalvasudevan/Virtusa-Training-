import java.util.Scanner;  
public class AdamNumberExample  
{  
//function that finds the reverse of the number  
static int reverseDigits(int num)  
{  
//stores the reverse number      
int rev = 0;  
//executes until the condition becomes false  
while (num > 0)  
{  
//finds the last digit of the given number and add it to the variable rev  
rev = rev * 10 + num % 10;  
num = num / 10;  
}  
//returns the reverse number  
return rev;  
}  
//function that finds the square of the number  
static int square(int num)  
{  
//returns the square      
return (num * num);  
}  
//function that checks if the number is Adam or not  
static boolean isAdamNumber(int num)  
{  
// Square first number and square  
// reverse digits of second number  
int a = square(num);  
int b = square(reverseDigits(num));  
 

if (a == reverseDigits(b))  
 
return true;  

return false;         
}  

public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
  
int num = sc.nextInt();  
if (isAdamNumber(num))  
System.out.println(num+ " is an Adam number.");  
else  
System.out.println(num+ " not an Adam number.");      
}  
}  