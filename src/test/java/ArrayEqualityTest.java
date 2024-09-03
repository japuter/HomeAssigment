import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 };  // Modified last element to make arrays unequal
        assertArrayEquals(a1, a2, "Arrays should not be equal");  // Expect this to fail
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };  // Changed the last element in the last array to make them unequal
        assertArrayEquals(a11, a12, "Multi-dimensional arrays should not be equal");  // Expect this to fail
    }

    // b. Writing a new test method
    @Test
    public void testDifferentTypeArrayEquality() {
        // This test is for demonstration; typically you wouldn't compare different types like this as assertArrayEquals requires the same array type
        String[] stringArray = {"one", "two"};
        Double[] doubleArray = {1.0, 2.0};

        // The below line will cause a compilation error due to type mismatch
        // assertArrayEquals(stringArray, doubleArray, "Should fail due to type mismatch");

        // Instead, testing what happens when attempting to compare incompatible types
        assertThrows(ArrayStoreException.class, () -> {
            // Simulate a comparison operation that might cause an exception due to type incompatibility
            Object[] combinedArray = new Object[2];
            System.arraycopy(stringArray, 0, combinedArray, 0, 2);
            System.arraycopy(doubleArray, 0, combinedArray, 0, 2);
        }, "Expected an ArrayStoreException due to type incompatibility");
    }
}
