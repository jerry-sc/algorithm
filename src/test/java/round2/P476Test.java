package round2;

import org.junit.Test;

import static org.junit.Assert.*;

public class P476Test {

    private P476 p476 = new P476();

    @Test
    public void test1() {
        assertEquals(2, p476.findComplement(5));
    }

}