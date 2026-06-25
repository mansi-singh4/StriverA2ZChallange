// Print 1 to N using Recursion
import java.util.Scanner;

public class print1toN {
    public static void recurr(int curr,int n){
        if(curr>n)
            return;
        System.out.println(curr);
        recurr(curr+1,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        recurr(1,num);
        sc.close();
    }
    
}
