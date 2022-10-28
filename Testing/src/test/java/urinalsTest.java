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

        Assertions.assertEquals(true,uri.checkForValidString(new String("91018")));
        System.out.println("====== Jay Patel == TEST ONE EXECUTED =======");
    }
}