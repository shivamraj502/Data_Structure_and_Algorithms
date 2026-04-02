public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            res[i] = -1; // default

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] ans = nextGreater(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
