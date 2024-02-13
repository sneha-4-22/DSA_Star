class firstPalindrome {
    public String Palindrome(String[] words) {
        for(String str:words){
            int s=0;
            int l=str.length()-1;
            boolean flag=true;
            while(s<l){
                if(str.charAt(s)!=str.charAt(l)){
                    flag=false;
                }
                s++;
                l--;
            }
            if(flag){
                return str;
            }
        }return "";
    }
}
