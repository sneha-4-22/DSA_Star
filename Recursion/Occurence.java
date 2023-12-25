package Recursion;

public class Occurence {
    public static int first=-1;
    public static int last=-1;
    public static void FLocc(String s,int idx,char a){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=s.charAt(idx);
        if(current==a){
            if(first==-1) first=idx;
            else last=idx;
        }
        FLocc(s, idx+1, a);
    }
    public static void main(String[] args) {
        String a="jouyjuj";
        FLocc(a, 0, 'j');
    }
}
