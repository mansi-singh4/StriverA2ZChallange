//  Given two integers N1 and N2, find their greatest common divisor.

import java.util.Scanner;


public class GCD{
    public static int findGCD(int a , int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else {
                b=a%b;
            }

        }
        if(a==0)
            return b;
        return a;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=findGCD(num1,num2);
        System.out.println("GCD is "+ gcd);
        sc.close();
    }
}