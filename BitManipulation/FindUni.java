package BitManipulation;

public class FindUni {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,7,8,2};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int i:arr){
            unique^=i;
        }return unique;
    }
}
