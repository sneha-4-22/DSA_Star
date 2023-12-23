package ConditionalStatements;

import java.util.Scanner;

public class yo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int age =sc.nextInt();
        // if (age>18){
        //     System.out.println("yay you are adult sneha");
        // }
        // else {
        //     System.out.println("hey you are not adult yet ");
        // }
        // if (age%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
       
        int button=sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("nameste");
                break;
            case 2:
                System.out.println("hello");
                break;
            default:
                System.out.println("bonjour");
        }
         sc.close();
    }
}
