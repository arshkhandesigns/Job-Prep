import java.util.Scanner;
import java.util.*;

public class loop{

    /*There are three types of loops we used in java 
    * while loop 
    * for loop 
    * do while loop
    */


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        /*
        # while loop:
    example:
    while (condition){
    
    }
    */
        // int counter = 0;
        // System.out.println("Enter a number that times you want to print Hello world");
        // int  a = sc.nextInt();
        // while(counter<=a){
        //     System.out.println("Hello world");
        //     counter++;
        // }
        // System.out.println("Here i print Hello World " + a + " Times.");

        //print Tables of entering number using while loop
        // System.out.println("Enter any Number");
        // int t = sc.nextInt();
        // int m = 1;
        // System.out.println("Table of " + t);
        // while(m<=10){
        //     System.out.println(t + " X " + m + " = " + (t*m));
        //     m++;
        // }

        //Print sum of first natural numbers
        // System.out.println("Enter any Number");
        // int n = sc.nextInt();
        // int a = 1;
        // int sum = 0;
        // while(a<=n){
        //     sum += a;
        //     a++;
        // }       
        // System.out.println("Sum of First " + n + " Natural Numbers = " + sum);

        // for loop:
        /*
         * for (initialisation; condition; updation){
         * }
         */

        //  Print square pattern

        // System.out.print("Enter Any Number: ");
        // int s = sc.nextInt();
        // for(int i = 1; i<=s; i++){
        //     int t = 1;
        //     while (t<=s){
        //     System.out.print("*");
        //     t++;
        //     }
        //      System.out.println();
        // }
       
        //Print Reverse Number:
        // System.out.print("Enter Any Number: ");
        // int n = sc.nextInt();
        // while(n>0){
        //     int l = n % 10;
        //     System.out.print(l);
        //     n = n/10;
        // }

        //do while loop :

        /*
         * do{
         * }
         * while(condition)
         */

         //Break Statement :to exit a loop 
         //Example :get numbers until user enter mutiple of 10
        //  do{
        //     int s = sc.nextInt();
        //     if(s%10==0){
        //         break;
        //     }
        //     System.out.println(s);
        //  }
        //  while(true);

        //Continue Statement: to skip an iteration

        /*Example: i want to print n numbers but not an specifice number 
        */

        // System.out.print("Enter Any Number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter a number that you want to skip: ");
        //     int s = sc.nextInt();
        // for(int i = 1; i<=a; i++){
        //     if (i==s){
        //         continue;
        //     }            
        //     System.out.println(i);
        // }

        //Display all numbers entered by uswe except multiples of 10:

        // do{
        // System.out.print("Enter Any Number: ");
        // int a = sc.nextInt();
        // if(a%10==0){
        //     continue;
        // }
        // System.out.println(a);
        // }
        // while(true);

        //Check if a number is prime or not

//         System.out.print("Enter Any Number: ");
//         int n = sc.nextInt();
//         if(n==2){
//             System.out.println("Its a Prime Number");
//         }
//         else{
//         Boolean isprime =true;
//         for(int i = 2; i<n; i++){
//             if (n%i==0){
//                 isprime = false;
//             }
//         }
//         if(isprime == false){
//             System.out.println("Its a not a Prime Number");
//         }
//         else{
//             System.out.println("Its a Prime Number");
//         }
// }

        //Factorial Number

        // System.out.print("Enter Any Number: ");
        // int n = sc.nextInt();
        // int fact = 1;
        // while(n>0){
        //      fact = fact * n;
        //      n--;
        // }
        // System.out.println("Factorial of Given Number is " + fact);

        //print sum of odd and even numbers


        // int n,choice;
        // int evenSum =0, oddsum=0;
        // do{
        // System.out.print("Enter Any Number: ");
        //  n = sc.nextInt();

        //  if( n %2==0){
        //     evenSum +=n;
        //  }
        //  else{
        //     oddsum += n;
        //  }
        // System.out.println("Do you want continue? Press 1 for yes or 0 for no");
        //  choice = sc.nextInt();
        // }
        // while(choice==1);

        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddsum);
    } 
}
