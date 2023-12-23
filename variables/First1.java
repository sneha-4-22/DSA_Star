package variables;
class First1{
    public static void main(String[] args) {
        System.out.println("hello world");
        String name="Sneha kumari";
        int a =78;
        int b=90;
        double k =90.88;
         //primitative 1byte 2short 2char 1boolean 4int  8long 4float 8double
         // non primitive String array class object interface 
         // bodmas is not follow in java instead we have priority based system in it */% > +- L TO R
         int ans =a*b/a-b; //78*90/78-90
         System.out.println(ans);
         System.out.println(k+name);
         //()have greatest priority 
    }
}