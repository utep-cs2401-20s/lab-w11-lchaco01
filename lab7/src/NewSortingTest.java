import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSortingTest {
/*All tests have a different size for testing purposes*/
    @Test
    public void testNewSort() {
        int[] test = {2,5,3,1,4,6};
        int size = 3;
        int[] exp = {1,2,3,4,5,6};
        NewSorting ns = new NewSorting();
        ns.newSorting(test,size);
//        for(int i = 0; i < test.length; i++) {
//            System.out.print(test[i] + " ");
//        }
        assertArrayEquals(exp, test);
    }
    /* This test ensures that the program can run with regular number, the test passes and provides the expected array */

    @Test
    public void testNewSort2() {
        int[] test2 = {-6,-2,-5,-1,-3,-4};
        int size = 3;
        int[] exp = {-6,-5,-4,-3,-2,-1};
        NewSorting ns = new NewSorting();
        ns.newSorting(test2,size);
//        for(int i = 0; i < test2.length; i++) {
//            System.out.print(test2[i] + " ");
//        }
        assertArrayEquals(exp,test2);
    }
    /*This test was designed to test an array of negative numbers, the test passes and the expected array is provided.*/

    @Test
    public void testNewSort3() {
        int[] test3 = {-1,6,-7,4,-3,5};
        int size = 2;
        int[] exp = {-7,-3,-1,4,5,6};
        NewSorting ns = new NewSorting();
        ns.newSorting(test3,size);
//        for(int i = 0; i < test3.length; i++) {
//            System.out.print(test3[i] + " ");
//        }
        assertArrayEquals(exp,test3);
    }
    /*This test is designed to use an array that has both positive and negative numbers, the test passes and the expected array is provided. */
    @Test
    public void testNewSort4() {
        int[] test4 = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int size = 4;
        int[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        NewSorting ns = new NewSorting();
        ns.newSorting(test4, size);
//        for (int i = 0; i < test4.length; i++) {
//            System.out.print(test4[i] + " ");
//        }
        assertArrayEquals(exp, test4);
    }
    /*This test is designed to use a bigger array, the test passes, and the expected array is given.*/
    @Test
    public void testNewSort5() {
        int[] test5 = {101,85,1000,4,75,-100,50,7,32,-5,21,3};
        int size = 2;
        int[] exp = {-100,-5,3,4,7,21,32,50,75,85,101,1000};
        NewSorting ns = new NewSorting();
        ns.newSorting(test5, size);
//        for (int i = 0; i < test5.length; i++) {
//            System.out.print(test5[i] + " ");
//        }
        assertArrayEquals(exp, test5);
    }
    /*This test is designed to use an array that has a wider ranged numbers, the test passes and the expected array is provided.*/
    @Test
    public void testNewSort6() {
        int[] test6 = {1,3,2,4,2,3,4,1};
        int size = 2;
        int[] exp = {1,1,2,2,3,3,4,4};
        NewSorting ns = new NewSorting();
        ns.newSorting(test6, size);
//        for (int i = 0; i < test6.length; i++) {
//            System.out.print(test6[i] + " ");
//        }
        assertArrayEquals(exp, test6);
    }
    /*This test uses an array with duplicate numbers, the test passes and the expected array is provided.*/
    @Test
    public void testNewSort7() {
        int[] test7 = {0,0};
        int size = 5;
        int[] exp = {0,0};
        NewSorting ns = new NewSorting();
        ns.newSorting(test7, size);
//        for (int i = 0; i < test7.length; i++) {
//            System.out.print(test7[i] + " ");
//        }
        assertArrayEquals(exp, test7);
    }
    /*This test uses an array with only zeros and a size bigger than the array, the test passes and provides the expected array.*/
}