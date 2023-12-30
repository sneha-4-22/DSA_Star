package Recursion;

public class moveX {
    public static void movex(String s,int idx,int count,String yo){
        if(idx==s.length()-1){
            for(int i=0;i<count;i++){
                yo+='x';
            }
            System.out.println(yo);
            return;
        }
        char current=s.charAt(idx);
        if(current=='x'){
            count++;
            movex(s, idx+1, count, yo);
        }else{
            yo+=current;
            movex(s, idx+1, count, yo);
        }
    }
    public static void main(String[] args) {
        String s="axbxxcboiyxxx";
        movex(s, 0, 0, "");
    }
}
