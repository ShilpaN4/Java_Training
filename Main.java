package day3;

import java.util.Scanner;

 class Main{

	  public static int checkSum(int number)
	  {
	     int lastDigit = 0;
	     int oddDigitSum = 0;
	     while(number!=0)
	     {	        
	         lastDigit = number%10;
	         if(lastDigit % 2 != 0)
	         {
	            oddDigitSum += lastDigit;
	         }
	         number = number / 10;
	      }
	     
	      return oddDigitSum;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      int number = 0;
	      int sum = 0;
	      Scanner scan =  new Scanner(System.in);
	      System.out.print("Enter an integer :");
	      number = scan.nextInt();
	      sum= checkSum(number);
	      System.out.println("The sum of odd digits of the number "+number+" = "+ sum);
	      scan.close();
	  }
	}

