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
public static void main(String[] args) {
    // tableof();
    Scanner s = new Scanner(System.in);
    int n  = s.nextInt();
    int r = s.nextInt();
    System.out.println(factotrialof(n));
    System.out.println(BCof(n, r));
}
}