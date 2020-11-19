import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfIntTest {
    @Test
    public void changeXToBinaryTest() {
        int[] binaryValueOfTen = UtilityOfInt.changeXToBinary(10);
        assertEquals(0, binaryValueOfTen[11]);
        assertEquals(1, binaryValueOfTen[12]);
        assertEquals(0, binaryValueOfTen[13]);
        assertEquals(1, binaryValueOfTen[14]);
        assertEquals(0, binaryValueOfTen[15]);
    }


}