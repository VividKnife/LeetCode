package medium;

/**
 * Created by shufakan on 5/15/17.
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/#/description">LeetCode ZigZag Conversion</a>
 */
public class ZigZagConversion {
    public static String solution(String s, int numRows) {
        int length = s.length();
        if(numRows == 1) return s;
        if(length <= numRows) return s;
        char[] input = s.toCharArray();
        StringBuilder[] zigZagBuilder = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            zigZagBuilder[i] = new StringBuilder();
        }
        int rows = 0;
        int oneSet = numRows*2-2;
        for(int i = 0; i < length;) {
            if (rows < numRows) {
                //System.out.println("index: " + i + " row+: " + rows);
                zigZagBuilder[rows++].append(input[i++]);
            } else if (rows >= numRows && rows <= oneSet) {
                //System.out.println("index: " + i + " row-: " + (oneSet-rows));
                zigZagBuilder[oneSet-rows++].append(input[i++]);
            } else rows = 1;
        }
        for (int i = 1; i < numRows; i++) {
            zigZagBuilder[0].append(zigZagBuilder[i]);
        }
        return zigZagBuilder[0].toString();
    }
}
