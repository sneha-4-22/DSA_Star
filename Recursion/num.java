package Recursion;
public class num {
    public static void main(String[] args) {
        PrintNum(5);
    }

    static void PrintNum(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        PrintNum(n - 1);
        System.out.println(n);
    }
}


