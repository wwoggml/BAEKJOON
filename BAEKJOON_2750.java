public class BAEKJOON_2750 {
    static int sorted[];
    public static void merge(int list[], int left, int mid, int right) {
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;

        while (i <= mid && j <= right) {
            if (list[i] <= list[j])
                sorted[k++] = list[i++];
            else
                sorted[k++] = list[j++];
        }

        if (i > mid) {
            for (l = j; l <= right; l++)
                sorted[k++] = list[l];
        } else {
            for (l = i; l <= mid; l++)
                sorted[k++] = list[l];
        }
        for (l = left; l <= right; l++) {
            list[l] = sorted[l];
        }
    }
}
