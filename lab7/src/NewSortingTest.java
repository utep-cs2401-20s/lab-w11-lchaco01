import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSortingTest {

    @Test
    public void testNewSort() {
        NewSorting sol = new NewSorting();
        int[] test = {2,5,3,1,4,6};
        int size = 3;
        int[] exp = {1,2,3,4,5,6};
        assertArrayEquals(exp, sol.newSorting(test, size));
    }

}