// Smallest window containing all target characters
class Solution {

    private int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public void mergeArrays(int a[], int b[]) {

        int n = a.length;
        int m = b.length;

        int gap = nextGap(n + m);

        while (gap > 0) {

            int i, j;

            // Compare elements in first array
            for (i = 0; i + gap < n; i++) {
                if (a[i] > a[i + gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                }
            }

            // Compare between arrays
            for (j = (gap > n) ? gap - n : 0;
                 i < n && j < m;
                 i++, j++) {

                if (a[i] > b[j]) {
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
            }

            // Compare elements in second array
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (b[j] > b[j + gap]) {
                        int temp = b[j];
                        b[j] = b[j + gap];
                        b[j + gap] = temp;
                    }
                }
            }

            gap = nextGap(gap);
        }
    }
}