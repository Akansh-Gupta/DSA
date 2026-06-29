public class NextPermutationOfString {

    static void nextPermutation(char[] arr) {

        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i == -1) {
            System.out.println("No next permutation");
            return;
        }
        int j = n - 1;

        while (arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int left = i + 1, right = n - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {

        String s = "ABDC";

        nextPermutation(s.toCharArray());
    }
}