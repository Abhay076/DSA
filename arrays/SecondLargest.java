public class SecondLargest {

    public static int secondLargests(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                return secondLargest = arr[i];
            }
        }
        if (secondLargest != Integer.MIN_VALUE) {
			return secondLargest;
		} else {
			return -1;
		}

        // return -1;
     }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int ans = secondLargests(arr);
        System.out.println(ans);
    }
}
