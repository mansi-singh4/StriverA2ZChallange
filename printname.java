// Without Recursion


// import java.util.Scanner;

// public class printname{
//     public static void printnames(int a,String n){
//         while(a>0){
//             a--;
//             System.out.println(n);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num= sc.nextInt();
//         System.out.println("Enter your name:");
//         String name=sc.next();
//         printnames(num, name);
        
        
        

//         sc.close();
//     }
// }

// With Recursion

import java.util.Scanner;

public class printname{
    public static void printnames(int a,String n,int count){
        if(count==a){
            return;
        }
        
        System.out.println(n);
        printnames(a, n, count+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        System.out.println("Enter your name:");
        String name=sc.next();
        printnames(num, name,0);
        sc.close();
    }}