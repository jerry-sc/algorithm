package round2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018-02-05
 *
 * @author Jerry Shen
 */
public class P482Test {

    private P482 p482 = new P482();

    @Test
    public void test1() {
        assertEquals("5F3Z-2E9W", p482.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    public void test2() {
        assertEquals("AA-AA", p482.licenseKeyFormatting("--a-a-a-a--", 2));
    }

}