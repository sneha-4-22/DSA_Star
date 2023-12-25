package Recursion;
//o(2^n-1)
public class towerOfHanoi {
    public static void tower(int n,String src,String helper,String dest){
        if(n==1){
             System.out.println("Move the disk "+n+"  from "+src+ " to "+dest);
            return;
        }else{
       tower(n-1,src,dest,helper);
       System.out.println("MOve the disk "+n+"  from "+src+ " to "+dest);
       tower(n-1, helper, src, dest);}
    }
    public static void main(String[] args) {
        int n=2;
        tower(n,"S","H","D");
    }
}
