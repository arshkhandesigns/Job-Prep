//here cs is Contional Statements

import java.util.*;

public class cs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("enter the second number: ");
        // int b = sc.nextInt();
        // if (a>b){
        //     System.out.println("First number is Greater. i.e. " + a);
        // }
        // else{
        //     System.out.println("Second number is Greater i.e. " + b);
        // }
        // if (a%2==0){
        //     System.out.println("The Number is Even");
        // }
        // else {
        //     System.out.println("The number is Odd");
        // }
        //Income Tax Calculator
        // float  tax = 0;
        // System.out.println("Enter your Income: ");
        // int i = sc.nextInt();
        // if(i<5){
        //     tax = 0;
        //     System.out.println("Your Income Tax is 0.So your Income After tax is " + i + " Lakh");
        // }
        // else if(i>=5 && i<10){
        //     tax = i - (i*0.2f);
        //     System.out.println("Your Income tax is 20%.So your Income After tax is " + tax + " Lakh");
        // }
        // else{
        //     tax =  i - (i*0.3f);
        //     System.out.println("Your Income tax is 30%. So your Income after tax is " + tax + " Lakh");
        // }

        //Print the largest of 3 Number
        // System.out.println("Enter First Number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int b = sc.nextInt();
        // System.out.println("Enter Third Number: ");
        // int c = sc.nextInt();
        // if(a==b && a==c){
        //     System.out.println("All Number are Equal.");
        // }
        // else if(a>=b && a>=c){
        //     System.out.println("First number is greater than all other number i.e. " + a);
        // }
        // else if(b>=a && b>=c){
        //     System.out.println("Second number is greater than all other number i.e. " + b);
        // }
        // else{
        //     System.out.println("Third number is greater than all other number i.e. " + c);
        // }

        //ternary operator

        // int a =5<6?6:7;
        // System.out.println(a);

        //Check if Student is pass or fail

        // System.out.println("Enter your Marks : ");
        // int m = sc.nextInt();
        
        //Using ternary operator 

        // String status = m>=33?"Pass":"Fail";
        // System.out.println(status);

        //Simple if else code

        // if (m>=33){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        //Calculator
        // System.out.println("Enter First Number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int b = sc.nextInt();
        // System.out.println("Enter Operation " + "+" + "-" + "/" + "*" + "%");
        // char o = sc.next().charAt(0);
        // switch(o){
        //     case '+': System.out.println(a+b);
        //     break;
        //      case '-': System.out.println(a-b);
        //     break;
        //      case '*': System.out.println(a*b);
        //     break;
        //      case '/': System.out.println(a/b);
        //     break;
        //     case '%': System.out.println(a%b);
        //     break;
        //     default:System.out.println("Error");

        // }
        
        // System.out.println("Enter Number : ");
        // int a = sc.nextInt();
        // if(a>=0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Ngative");
        // }

        // double temp = 103.5;
        // if(temp>100){
        //      System.out.println("You have a fever");
        // }
        // else{
        //      System.out.println("You don't have a fever");
        // }

        // int d = sc.nextInt();
        // switch(d){
        //     case 1 : System.out.println("Sunday");
        //     break;
        //     case 2 : System.out.println("Monday");
        //     break;
        //     case 3 :  System.out.println("Tuesday");
        //     break;
        //     case 4 :  System.out.println("Wednesday");
        //     break;
        //     case 5 :  System.out.println("Thursday");
        //     break;
        //     case 6 :  System.out.println("Friday");
        //     break;
        //     case 7 :  System.out.println("Saturday");
        //     break;
        //     default:  System.out.println("There are only 7 days in a week");

        //Leap year

        //  System.out.println("Enter Year : " );
        //  int y = sc.nextInt();
        //  if (y%4==0){
        //     if(y%100==0){
        //          if(y%400==0){
        //              System.out.println("Its a Leap Year");
        //          }
        //          else{
        //              System.out.println("Its not a Leap Year");
        //          }
        //     }
        //     else{
        //          System.out.println("Its a Leap Year");
        //     }
        //  }
        //  else{
        //      System.out.println("Not a Leap year");
        //  }

        //or 

 System.out.print("Input the year: ");
 int year = sc.nextInt();
 boolean x = (year % 4) == 0;
 boolean y = (year % 100) != 0;
 boolean z = ((year % 100 == 0) && (year % 400 == 0));
 if (x && (y || z)) {
 System.out.println(year + " is a leap year");
 } else {
 System.out.println(year + " is not a leap year");
 }
        }
    }
    

