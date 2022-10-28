import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class urinalsTest {
    validurinals uri=new validurinals();

    @BeforeEach
    void setUpofthemethod() {
    }

    @AfterEach
    void tearDownofthemethod() {
    }
    @org.junit.jupiter.api.Test
    void main() {
    }

    @Test
    void checkForValidString(){

        assertFalse(uri.checkForValidString("91018"));
        assertFalse(uri.checkForValidString("127%881,0"));
        assertTrue(uri.checkForValidString("1000100101"));
        assertTrue(uri.checkForValidString("0100010"));
        assertFalse(uri.checkForValidString("098"));
        assertTrue(uri.checkForValidString("10100"));
        assertTrue(uri.checkForValidString("00000100010001"));
        assertFalse(uri.checkForValidString("110"));
        assertFalse(uri.checkForValidString("11111111111"));
        assertFalse(uri.checkForValidString("Jay Patel"));
        System.out.println("====== Jay Patel == TEST ONE EXECUTED =======");
    }
    @Test
    void countValidUrinals(){
        assertEquals(1,uri.countValidUrinals("10001"));
        assertEquals(5,uri.countValidUrinals("000000000"));
        assertEquals(8,uri.countValidUrinals("00000000010000010000100001"));
        assertEquals(4,uri.countValidUrinals("000001001000101010100001001"));
        assertEquals(5,uri.countValidUrinals("10000100001010101000000100001"));
        assertEquals(1,uri.countValidUrinals("01000"));
        System.out.println("====== Jay Patel == TEST TWO EXECUTED =======");
    }
}