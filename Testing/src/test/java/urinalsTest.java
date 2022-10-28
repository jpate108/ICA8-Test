import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class urinalsTest {

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

        assertFalse(validurinals.checkForValidString("91018"));
        assertFalse(validurinals.checkForValidString("127%881,0"));
        assertTrue(validurinals.checkForValidString("1000100101"));
        assertTrue(validurinals.checkForValidString("0100010"));
        assertFalse(validurinals.checkForValidString("098"));
        assertTrue(validurinals.checkForValidString("10100"));
        assertTrue(validurinals.checkForValidString("00000100010001"));
        assertFalse(validurinals.checkForValidString("110"));
        assertFalse(validurinals.checkForValidString("11111111111"));
        assertFalse(validurinals.checkForValidString("Jay Patel"));
        System.out.println("====== Jay Patel == TEST ONE EXECUTED =======");
    }
    @Test
    void countValidUrinals(){
        assertEquals(1,validurinals.countValidUrinals("10001"));
        assertEquals(5,validurinals.countValidUrinals("000000000"));
        assertEquals(8,validurinals.countValidUrinals("00000000010000010000100001"));
        assertEquals(4,validurinals.countValidUrinals("000001001000101010100001001"));
        assertEquals(5, validurinals.countValidUrinals("10000100001010101000000100001"));
        assertEquals(1,validurinals.countValidUrinals("01000"));
        System.out.println("====== Jay Patel == TEST TWO EXECUTED =======");
    }
}