import java.lang.*;
import java.io.*;
import java.util.*;
class Number
{
int num,c;
Scanner s=new Scanner(System.in);

void even()
{
	System.out.println("\n'Even Numbers' are integers that are exactly divisible by 2. Whereas, an 'Odd number' cannot be exactly divided by 2.\n");
	System.out.println("\n\nEnter a number to check it is even or not:\n");
	num=s.nextInt();
	if(num%2==0)
	System.out.println(num+" is even\n");
	else
	System.out.println(num+" is odd\n");
	do
	{
		System.out.println("\n1.Explanation");
		System.out.println("2.Return to Main Choice\n");
		c=s.nextInt();
		switch(c)
		{
			case 1: 
				if(num%2==0)
				System.out.println(num+" is divisible by 2, Hence "+num+" is even number\n");
				else
				System.out.println(num+" is not divisible by 2, Hence "+num+" is odd number\n");
				break;
			default: System.out.print("");
		}
	}while(c<=1);
}

void prime()
{
	int flag = 0;
	System.out.println("\n'Prime number' is a positive integer that is divisible only by 1 and itself.\n\n'Composite Number' is a number  which has more than two factors.\n");
	System.out.println("\n\nEnter an integer to check whether it is prime or composite:\n");
	num=s.nextInt();
	for(int i = 2; i<=num/ 2; i++)
	{
		if (num%i==0)
		{
			flag = 1;
			break;
		}
	}
	if(num==1)
	{
		System.out.println("1 is neither prime nor composite");
	}
	else
	{
		if (flag == 0)
		System.out.println(num+" is a prime number");
		else
		System.out.println(num+" is a composite number");
	}
	do
	{
		System.out.println("\n1.Explanation");
		System.out.println("2.Return to Main Choice\n");
		c=s.nextInt();
		switch(c)
		{
			case 1: 
				if(num==1)
	{
		System.out.println("\n1 has only one positive factor i.e. no.1 only. Hence 1 is neither prime nor composite. It forms its own special category as a 'unit'\n");
	}
	else
	{
		if (flag == 0)
		System.out.println(num+" has no factors other than 1 and itself. So It is a prime number");
		else
		System.out.println(num+" has more than two factors. So It is a composite number");
	}
				
			default: System.out.print("");
		}
	}while(c<=1);

}

void table()
{
	int mul;
	System.out.println("\nEnter a number to print it's Multiplication Table:\n");
	num=s.nextInt();
	System.out.println("\nEnter the number of multiples of the table to be printed:\n");
	mul=s.nextInt();
	System.out.println("\n");
	for(int i=1;i<=mul;i++)
	{
		int temp=num*i;
		System.out.println(num+"*"+i+"="+temp);
	}
}

void armstrong()
{
	int d, rem, result=0;
	System.out.println("'\nArmstrong number' is number whose sum of cubes of each digit is equal to the number itself.\n");
	System.out.println("\n\nEnter a three-digit integer:\n");
	num=s.nextInt();
	d=num;
	while(d!=0)
	{
		 rem=d % 10;
		 result+=rem*rem*rem;
		 d/=10;
	}
	if (result == num)
	System.out.println(num+" is an Armstrong number");
	else
	System.out.println(num+" is not an Armstrong number");
	do
	{
		System.out.println("\n1.Explanation");
		System.out.println("2.Return to Main Choice\n");
		c=s.nextInt();
		switch(c)
		{
			case 1: 
			if (result == num)
		System.out.println("\nLet us take "+num+" and calculate the cube of each digit.\nNow add the cubes, Then we get "+num+".\nHence The given number is an Armstrong number");
		else
		System.out.println("\nLet us take "+num+" and calculate the cube each digit.\nNow add the cubes, Then we do not get "+num+".\nHence The given number is not an Armstrong number");
		break;
			default: System.out.print("");
		}
	}while(c<=1);
}

void perfect()
{
	int i, sum = 0;
	System.out.println("\n'Perfect number' is a positive integer which is equal to the sum of its proper positive divisors.\n");
	System.out.println("\n\nEnter any number to check perfect number:\n");
	num=s.nextInt();
	for(i=1;i<=num/2;i++)
	{
		if(num%i == 0)
		{
			sum += i;
		}
	}
	if(sum == num)
	{
		System.out.println(num+" is a perfect number");
	}	
	else
	{
	 	System.out.println(num+" is not a perfect number");
	}
}

void palindrome()
{
	int rev=0, rem, real;
	System.out.println("\nAn integer is a 'Palindrome' if the reverse of that number is equal to the original number.\n");
	System.out.println("\n\nEnter an integer: \n");
	num=s.nextInt();
	real= num;
	while(num!=0)
	{
		rem = num%10;
		rev = rev* 10 + rem;
		num /= 10;
	}

	if (real == rev)
	System.out.println(real+" is a palindrome");
	else
	System.out.println(real+" is not a palindrome");
}

void factor()
{
	System.out.println("\nFactor is a number that divides another number or expression evenly .i.e., with no remainder\n");
	System.out.println("\n\nEnter an integer to print its factors:\n");
	num=s.nextInt();
	System.out.println("\nFactors of "+num+" are: \n");
    	for (int i = 1;i <=num;i++) 
	{
        		if (num % i == 0) 
		{
			 System.out.println(i);
        		}
    	}
}

void divisibility()
{
	System.out.println("\nEnter a number you want to divide:");
	int item=s.nextInt();
	System.out.println("\nEnter a number to check whether it is divisible by "+item+":\n");
	num=s.nextInt();
	if(num%item==0)
	System.out.println(num+" is divisible by "+item);
	else
	System.out.println(num+" is not divisible by "+item);
}
void operations()
{
double a,b,nu,ii,precision = 0.00001;
do

{
	System.out.println("\n\n\t\t\t***Welcome to calculations section***\t\t\n\n ");
	System.out.println("\n\n1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Square");
	System.out.println("6.Cube");
	System.out.println("7.Square root");
	System.out.println("8.Cube root");
	System.out.println("9.Factorial");
	System.out.println("10.Logarithmic Calculation");
	System.out.println("11.Return to main\n");
	System.out.println("Enter your Choice:\n");
	c=s.nextInt();
	switch(c)
	{
		case 1: 
		System.out.println("Enter the first number:");
		a=s.nextDouble();
		System.out.println("Enter the Second number:");
		b=s.nextDouble();
		nu=a+b;
		System.out.println("The sum of two numbers is "+nu);
		break;

		case 2: 
		System.out.println("Enter the first number:");
		a=s.nextDouble();
		System.out.println("Enter the Second number:");
		b=s.nextDouble();
		nu=a-b;
		System.out.println("The difference between two numbers is "+nu);
		break;	

		case 3:
		System.out.println("Enter the first number:");
		a=s.nextDouble();
		System.out.println("Enter the Second number:");
		b=s.nextDouble();
		nu=a*b;
		System.out.println("The product of two numbers is "+nu);
		break;
		
		case 4: 
		System.out.println("Enter the numerator:");
		a=s.nextDouble();
		System.out.println("Enter the Denominator:");
		b=s.nextDouble();
		nu=a/b;
		double re=a%b;
		System.out.println("The Quotient is "+nu+"\nThe Remainder is "+re);
		break;
		
		case 5: 
		System.out.println("Enter a number to print its Square:");
		a=s.nextDouble();
		nu=a*a;
		System.out.println("The square of "+a+" is "+nu);
		break;
		
		case 6:
		System.out.println("Enter a number to print its cube:");
		a=s.nextDouble();
		nu=a*a*a;
		System.out.println("The cube of "+a+" is "+nu);
		break;

		case 7: 
		double sr;
		System.out.println("Enter a number to find the square root:");
		sr=s.nextDouble();
		for(ii = 1; ii*ii <=sr; ++ii);
	 	for(--ii; ii*ii < sr; ii += precision);
	      	System.out.println("Square root of given number "+ii);
		break;

		case 8:
		int cr;
	     	System.out.println("Enter a number to find the Cube root:");
		cr=s.nextInt();
		for(ii = 1; ii*ii*ii <=cr; ++ii);
	 	for(--ii; ii*ii*ii <cr; ii += precision);
	      	System.out.println("Cube root of given number "+ii);
		break;

		case 9:
		int fn,fact=1;  
		int number;   
		System.out.println("Enter a number to print its factorial:"); 
  		number=s.nextInt();
		for(fn=1;fn<=number;fn++)
		{    
		      fact=fact*fn;    
		 }  
		System.out.println("Factorial of "+number+" is: "+fact);
		break; 

		
		case 10:
		System.out.println("Enter a number to print its natural logarithm:");
		a=s.nextDouble();          
		System.out.println(Math.log(a));
		
		case 11:
		System.out.println("");
		}

	}while(c<=10);
}
}
class Numberfun
{
	public static void main(String args[])
	{
	Number n=new Number();
	Scanner s=new Scanner(System.in);
	int ch;
	do
	{
		System.out.println("\n\t\t*****_____Welcome to Number Fun____*****\n");
		System.out.println("\n\n1.Even or Odd");
		System.out.println("2.Prime or Composite");
		System.out.println("3.Multiplication Table");
		System.out.println("4.Armstrong or not");
		System.out.println("5.Perfect or not");
		System.out.println("6.Palindrome or not");
		System.out.println("7.Factors");
		System.out.println("8.Divisibility");
		System.out.println("9.Calculator");
		System.out.println("10.Exit\n\n");
		System.out.println("Enter your choice:\n");
		ch=s.nextInt();
		switch(ch)
		{
			case 1: n.even();
			break;
			case 2: n.prime();
			break;
			case 3: n.table();
			break;
			case 4: n.armstrong();
			break;
			case 5: n.perfect();
			break;
			case 6: n.palindrome();
			break;
			case 7: n.factor();
			break;
			case 8: n.divisibility();
			break;
			case 9: n.operations();
			break;
			case 10: System.exit(0);
			default: System.out.println("\nInvalid Choice\n");

			System.out.println("*****____Thank you for using Number fun____*****") ;
		}
	}while(ch<=10);
	}
}
