import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
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

        Assertions.assertEquals(false,uri.checkForValidString(new String("91018")));
        Assertions.assertEquals(false,uri.checkForValidString(new String("127%881,0")));
        Assertions.assertEquals(true,uri.checkForValidString(new String("1000100101")));
        Assertions.assertEquals(true,uri.checkForValidString(new String("0100010")));
        Assertions.assertEquals(false,uri.checkForValidString(new String("098")));
        Assertions.assertEquals(true,uri.checkForValidString(new String("10100")));
        Assertions.assertEquals(true,uri.checkForValidString(new String("00000100010001")));
        Assertions.assertEquals(false,uri.checkForValidString(new String("110")));
        Assertions.assertEquals(false,uri.checkForValidString(new String("11111111111")));
        System.out.println("====== Jay Patel == TEST ONE EXECUTED =======");
    }
}