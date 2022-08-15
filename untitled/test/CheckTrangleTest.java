import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTrangleTest {

    @org.junit.jupiter.api.Test
    void testShowTriangleIs() {
        CheckTrangle checkTrangle = new CheckTrangle(3,4,5);
        String expected = "Tam giac vuong";
        String result = checkTrangle.showTriangleIs();
        assertEquals(expected, result);
    }
}