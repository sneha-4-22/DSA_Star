package ARRAYS;

class ReverseVowelsOfString{
     public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            while(i<j&&!isvowel(arr[i])){
                i++;
            }
            while(i<j&&!isvowel(arr[j])){
                j--;
            }
            if(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }return new String(arr);
    }
    boolean isvowel(char a){
        return "aeiouAEIOU".indexOf(a)!=-1;
    }
}