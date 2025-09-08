import java.util.*;

public class Function {

    // public static void Calsum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("Sum Is : " + sum);
    // }

    // public static int Calsum(int a, int b){// Parameters or formal parameters.
    //     int sum = a + b;
    //     return sum;
    // }

    //Function is block of code which can be re-use. 
    /*
     * Syntax: 
     * 
     * returnType name(){
     * // body
     * }
     */

     //Call by value e.g. swap

//      public static void changevalue(int a) {
//         a = 10;
//         System.out.println(a);
//      }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int num1 = sc.nextInt();
//         // int num2 = sc.nextInt();
//         // //actual parameters 
//         //  System.out.println("Sum Is : " + Calsum(num1,num2));
//         int a = 5;
//         changevalue(a);
//         System.out.println(a);//it is actual value out of function.
//     }
    
// }

//Function for Table of given number
public static void tableof(){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for(int i=1; i<=10; i++){
        System.out.println(t + " X " + i + " = " + (t*i));
    }
}

public static int factotrialof(int f){
    int fact = 1;
    for(int i =1; i<=f; i++){ 
        fact = fact *i;
    }
    return fact;
}

//Bionomial Coficient of 
/*
 * nCr = n!/r!(n-r)!
 */

public static int BCof(int n,int r){
    int factofn = factotrialof(n);
    int factofr = factotrialof(r);
    int factofnr = factotrialof(n-r);
    int BiCOF = factofn/(factofr*factofnr);
    return BiCOF;
}

//Check if n is prime number
public static boolean isPrime(int n){
    boolean isPrime =true;
    if(n==2){
        isPrime = true;
    }
    for(int i = 2; i<n ; i++){
        if(n % i == 0){
            isPrime = false;
        }
    }
    return isPrime;
}

//print all prime in a range from 2 to n

public static void PrimeRange(int n){
    if(n==2){
        System.out.print("2 ");
    }
    for(int i = 2; i < n; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
     System.out.println();
}

//Convert to Binary to Decimal
public static void BitoDec(int n) {
    int pow =0, dec =0;
    while(n>0){
        int ld = n%10;
        dec = dec + (ld * (int)Math.pow(2, pow));
        pow++;
        n = n/10;
    }   
    System.out.println(dec);
}

public static void DectoBi(int n){
    int rem = 0;
    int bi = 0; 
    int pow = 0;
    while(n>0){
        rem = n%2;
        bi = bi + (rem * (int)Math.pow(10,pow));
        pow++;
        n = n/2;
    }
    System.out.println(bi);
}

public static void Avgthree(int a, int b, int c){
    int sum = a+b+c;
    int avg = sum/3;
    System.out.println(avg);
}

public static boolean isEven(int n){
    if(n%2==0){
        return true;
    }
    else{
        return false;
    }
}

public static void isPalindrome(int n) {
    int rev = 0;
    int pal = n;
    while(pal!=0){
        int ld = pal%10;
        rev = rev*10 + ld;
        pal= pal/10;
    }
    if(n == rev){
        System.out.println("Its a Palindrome Number.");
    }
    else{
        System.out.println("It is not a Palindrome Number.");
    }
}

public static void SumofDig(int n){
    int sum = 0;
    while(n>0){
        int ld = n%10;
        sum = sum + ld;
        n =n/10;
    }
    System.out.println(sum);
}

public static void main(String[] args) {
    // tableof();
    Scanner s = new Scanner(System.in);
    int n  = s.nextInt();
    // int r = s.nextInt();
    // System.out.println(factotrialof(n));
    // System.out.println(BCof(n, r));
    // System.out.println(isPrime(n));
    // PrimeRange(n);
    // BitoDec(n);
    // DectoBi(n);
    // Avgthree(2,5,6);
    // System.out.println(isEven(n));
    // isPalindrome(n);
    // SumofDig(n);
}
}