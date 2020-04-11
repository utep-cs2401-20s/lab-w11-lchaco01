public class NewSorting {
    public void newSorting(int[] a, int size) {
        /*checks if the array is less than or equal to the given size*/
        if (a.length <= size) {
            /*start and end are given a value and sent to quickSort*/
            int start = 0;
            int end = a.length - 1;
            quickSort(a,start,end);
        } else {
            /*cuts the array to be able to use quickSort*/
            int mid = a.length / 2;

            /*creates a new array called left*/
            int[] left = new int[mid];

            /*creates a new array called right*/
            int[] right = new int[a.length - mid];

            /*populates the left array*/
            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }

            /*populates the right array*/
            for (int i = 0; i < right.length; i++) {
                right[i] = a[mid + i];
            }

            /*calls newSorting to see if left array and right array fits the size*/
            newSorting(left, size);
            newSorting(right, size);

            /*calls mergeSortedHalves after the arrays are within the size and have gone through quickSort*/
            mergeSortedHalves(a, left, right);
        }
    }

    private int part(int []a, int start, int end) {
        /*set pivot the beginning of the array*/
        int pivot = a[start];

        /*goes through the given array*/
        for (int i = start; i < end + 1; i++) {
            /*checks to see if pivot is the larger number and swaps it while moving the start point to put the array in order*/
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

        /*base case*/
        if (start < end && start >= 0) {
            /*while true it sends the array to part to be ordered*/
            int index = part(a, start, end);
            /*left array is sent to quickSort*/
            quickSort(a,start,index - 1);
            /*right array is sent to quickSort*/
            quickSort(a,index + 1, end);
        }

     }

     private void mergeSortedHalves(int [] a, int[] left, int [] right) {
        /*sets the points for the left and right arrays*/
        int lPoint = 0;
        int rPoint =  0;

        /*goes through both arrays*/
        for(int i = 0; lPoint < left.length || rPoint < right.length; i++) {
            /*if the left array reaches the end it places the right array element in the main array*/
            if (lPoint == left.length) {
                a[i] = right[rPoint];
                rPoint++;
                continue;
            }
            /*if the right array reaches the end it places the left array element in the main array*/
            if (rPoint == right.length) {
                a[i] = left[lPoint];
                lPoint++;
                continue;
            }
            /*if the element in the left array is smaller, it gets placed in the main array*/
            if (left[lPoint] < right[rPoint]) {
                a[i] = left[lPoint];
                lPoint++;
                /*if the elements in both arrays are equal, it places the element for the left array to the main array*/
            } else if (left[lPoint] == right[rPoint]) {
                a[i] = left[lPoint];
                lPoint++;
                /*if the element in the right array is smaller, it gets placed in the main array*/
            } else {
                a[i] = right[rPoint];
                rPoint++;
            }
        }
     }
}
