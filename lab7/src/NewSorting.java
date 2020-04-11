public class NewSorting {
    public void newSorting(int[] a, int size) {
        if (a.length <= size) {
            int start = 0;
            int end = a.length - 1;
            quickSort(a,start,end);
        } else {
            int mid = a.length / 2;
            int[] left = new int[mid];
            int[] right = new int[a.length - mid];

            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = a[mid + i];
            }
            newSorting(left, size);
            newSorting(right, size);
            mergeSortHalves(a, left, right);
        }
    }

    private int part(int []a, int start, int end) {
        int pivot = a[start];
        for (int i = start; i < end + 1; i++) {
            if (a[i] < pivot) {
                int temp = a[i];
                a[i] = pivot;
                a[start] = temp;
                start++;
            } else if (a[i] > pivot) {
                int temp = pivot;
                pivot = a[i];
                a[start] = temp;
                start++;
            }
        }
        return end;
    }
     private void quickSort(int [] a, int start, int end) {

        //base case
        if (start < end && start >= 0) {
            int index = part(a, start, end);
            //left
            quickSort(a,start,index - 1);
            //right
            quickSort(a,index + 1, end);
        }

     }

     private void mergeSortHalves(int [] a, int[] left, int [] right) {
        int lPoint = 0;
        int rPoint =  0;

        for(int i = 0; lPoint < left.length || rPoint < right.length; i++) {
            if (lPoint == left.length) {
                a[i] = right[rPoint];
                rPoint++;
                continue;
            }
            if (rPoint == right.length) {
                a[i] = left[lPoint];
                lPoint++;
                continue;
            }
            if (left[lPoint] < right[rPoint]) {
                a[i] = left[lPoint];
                lPoint++;
            } else if (left[lPoint] == right[rPoint]) {
                a[i] = left[lPoint];
                lPoint++;
            } else {
                a[i] = right[rPoint];
                rPoint++;
            }
        }
     }
}
