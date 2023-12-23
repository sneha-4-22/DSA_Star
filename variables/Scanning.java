package variables;

import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
