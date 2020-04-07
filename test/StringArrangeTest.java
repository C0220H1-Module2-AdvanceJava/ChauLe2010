import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrangeTest {
    private StringArrange stringArrange;

    @DisplayName("Tạo ra string mới với chuỗi cho trước")
    @Test
    void testGetShortString() {
        String input = "abcabcdgabxy";
        stringArrange = new StringArrange(input);
        String output = stringArrange.getShortString();
        String expected = "abcdg";
        assertEquals(expected,output);
    }

    @DisplayName("Tạo ra string mới với chuỗi ký tự khác nhau liên tiếp")
    @Test
    void testGetShortStringWithNoduplicateChar() {
        String input = "abcdefghjk";
        stringArrange = new StringArrange(input);
        String output = stringArrange.getShortString();
        String expected = "abcdefghjk";
        assertEquals(expected,output);
    }

    @DisplayName("Tạo ra string mới với chuỗi ký tự giống nhau từng cặp")
    @Test
    void testGetShortStringWithBurstSequential() {
        String input = "abcabcdgabmnsxy";
        stringArrange = new StringArrange(input);
        String output = stringArrange.getShortString();
        String expected = "abmnsxy";
        assertEquals(expected,output);
    }
}