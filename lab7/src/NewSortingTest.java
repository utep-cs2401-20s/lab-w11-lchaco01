import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSortingTest {

    @Test
    public void testNewSort() {
        int[] test = {2,5,3,1,4,6};
        int size = 3;
        int[] exp = {1,2,3,4,5,6};
        NewSorting ns = new NewSorting();
        ns.newSorting(test,size);
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        assertArrayEquals(exp, test);
    }

    @Test
    public void testNewSort2() {
        int[] test2 = {-6,-2,-5,-1,-3,-4};
        int size = 3;
        int[] exp = {-6,-5,-4,-3,-2,-1};
        NewSorting ns = new NewSorting();
        ns.newSorting(test2,size);
        for(int i = 0; i < test2.length; i++) {
            System.out.print(test2[i] + " ");
        }
        assertArrayEquals(exp,test2);
    }

    @Test
    public void testNewSort3() {
        int[] test3 = {-1,6,-7,4,-3,5};
        int size = 2;
        int[] exp = {-7,-3,-1,4,5,6};
        NewSorting ns = new NewSorting();
        ns.newSorting(test3,size);
        for(int i = 0; i < test3.length; i++) {
            System.out.print(test3[i] + " ");
        }
        assertArrayEquals(exp,test3);
    }
    @Test
    public void testNewSort4() {
        int[] test4 = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int size = 4;
        int[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        NewSorting ns = new NewSorting();
        ns.newSorting(test4, size);
        for (int i = 0; i < test4.length; i++) {
            System.out.print(test4[i] + " ");
        }
        assertArrayEquals(exp, test4);
    }
    @Test
    public void testNewSort5() {
        int[] test5 = {101,85,1000,4,75,-100,50,7,32,-5,21,3};
        int size = 2;
        int[] exp = {-100,-5,3,4,7,21,32,50,75,85,101,1000};
        NewSorting ns = new NewSorting();
        ns.newSorting(test5, size);
        for (int i = 0; i < test5.length; i++) {
            System.out.print(test5[i] + " ");
        }
        assertArrayEquals(exp, test5);
    }
}