import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1()
    {
        assertEquals(-1, Week4.max2Int(-2, -1));
    }

    @Test
    public void testMax2Int2()
    {
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int3()
    {
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int4()
    {
        assertEquals(1, Week4.max2Int(-1, 1));
    }

    @Test
    public void testMax2Int5()
    {
        assertEquals(0, Week4.max2Int(-1, 0));
    }

    @Test
    public void testMinArray1()
    {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        assertEquals(1, Week4.minArray(array));
    }

    @Test
    public void testMinArray2()
    {
        int[] array = new int[] {1};
        assertEquals(1, Week4.minArray(array));
    }

    @Test
    public void testMinArray3()
    {
        int[] array = {1, 1, 1, 1, 1};
        assertEquals(1, Week4.minArray(array));
    }

    @Test
    public void testMinArray4()
    {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> Week4.minArray(array));
    }

    @Test
    public void testMinArray5()
    {
        int[] array = {-2, -3, 5, 0, 9};
        assertEquals(-3, Week4.minArray(array));
    }

    @Test
    public void testCalculateBMI1()
    {
        assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.7));
    }

    @Test
    public void testCalculateBMI2()
    {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI3()
    {
        assertEquals("Thừa cân", Week4.calculateBMI(72, 1.7));
    }

    @Test
    public void testCalculateBMI4()
    {
        assertEquals("Béo phì", Week4.calculateBMI(90, 1.7));
    }

    @Test
    public void testCalculateBMI5()
    {
        assertThrows(IllegalArgumentException.class, () -> Week4.calculateBMI(-24, -1.9)); // Trọng lượng không hợp lệ
    }
} 