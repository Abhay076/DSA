public class Greatest {

    public static int greatest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 50 };
        int ans = greatest(arr);
        System.out.println(ans);
        
    }
}
