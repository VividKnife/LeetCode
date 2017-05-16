package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shufakan on 5/15/17.
 */
public class ZigZagConversionTest {

    private final String inputSet1 = "PAYPALISHIRING";
    private final String expectOutput1 = "PAHNAPLSIIGYIR";

    @Test
    public void solution() throws Exception {
        String solution1 = ZigZagConversion.solution(inputSet1, 3);
        assertEquals(expectOutput1, solution1);
    }

}