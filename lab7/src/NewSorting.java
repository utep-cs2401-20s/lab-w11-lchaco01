public class NewSorting {
    public void newSorting(int[] a, int size) {
        int start = a[0];
        int end = a.length -1;

        if (a.length <= size) {
            quickSort(a,start,end);
        } else {
            int mid = a.length / 2;
            int[] left = new int [mid];
            int [] right = new int[a.length - mid];

            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = a[i];
            }
            newSorting(left,size);
            newSorting(right, size);
            mergeSortHalves(a,left,right);
        }
    }

    public int part(int []a, int start, int end) {
        int pivot = a[start];
        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                start++;
                int temp = pivot;
                pivot = a[i];
                a[i] = temp;
            }
        int temp = a[end + 1];
            a[end + 1] = a[start];
            a[start] = temp;
        }
        return end + 1;
    }
     public void quickSort(int [] a, int start, int end) {

        //base case
        if (start < end) {
            int index = part(a, start, end);
            //left
            quickSort(a,start,(index - 1));
            //right
            quickSort(a,(index + 1), end);
        }

     }

     public void mergeSortHalves(int [] a, int[] left, int [] right) {
        int lPoint = 0;
        int rPoint =  0;

        for(int i = 0; lPoint < left.length || rPoint < right.length; i++) {
            if (lPoint == left.length) {
                a[i] = right[rPoint];
                rPoint++;
                continue;
            }
            if (rPoint == right.length) {
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
