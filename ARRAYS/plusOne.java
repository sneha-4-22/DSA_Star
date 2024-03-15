package ARRAYS;

public class plusOne {
    public int[] ans(int[] digits){
        for(int i=digits.length;i<0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }   
        digits=new int[digits.length +1];
        digits[0]=1;
        return digits;
    }
}
