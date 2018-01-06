package round1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P621Test {

    private P621 p621 = new P621();

    @Test
    public void test1() {
        char[] tasks = {'A','A','A','B','B','B'};
        assertEquals(8, p621.leastInterval(tasks, 2));
    }

}