public class NewSorting {
    public static void main(String[] args) {
//        int [] a = {0,1,2,3,4,5};
//        int size = 3;
//        newSorting(a, size);

        int [] a = new int[6];
        int [] b = {11,12,14};
        int [] c = {10,13,15};

        mergeSortHalves(a,b,c);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void newSorting(int[] a, int size) {
        if (a.length <= size) {
            quickSort(a);
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
     public static void quickSort(int [] a) {

     }

     public static void mergeSortHalves(int [] a, int[] left, int [] right) {
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
