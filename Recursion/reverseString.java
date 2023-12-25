package Recursion;

public class reverseString  {
    public static void reverse(String s,int idx){
        if(idx==-1){
            return;
        }else{
        System.out.print(s.charAt(idx));
        reverse(s, idx-1);}
    }
    public static void main(String[] args) {
        String name="Sneha kumari";
        reverse(name,name.length()-1);
    }
}
