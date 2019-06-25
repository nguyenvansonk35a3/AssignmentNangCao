package MODEL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NhanVienTest {

    public NhanVienTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * getMaNV
     */
    @Test
    public void testGetMaNV() {
        NhanVien instance = new NhanVien();
        final String testValue = "001";
        instance.setMaNV(testValue);

        String expResult = testValue;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * setMaNV
     */
    @Test
    public void testSetMaNV() {
        NhanVien instance = new NhanVien();
        final String testValue = "008";
        instance.setMaNV(testValue);

        String expResult = testValue;
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * getMatKhau
     */
    @Test
    public void testGetMatKhau() {
        NhanVien instance = new NhanVien();
        final String testValue = "son123";
        instance.setMatkhau(testValue);

        String expResult = testValue;
        String result = instance.getMatkhau();
        assertEquals(expResult, result);
    }

    /**
     * setMatKhau
     */
    @Test
    public void testSetMatKhau() {
        NhanVien instance = new NhanVien();
        final String testValue = "123";
        instance.setMatkhau(testValue);

        String expResult = testValue;
        String result = instance.getMatkhau();
        assertEquals(expResult, result);
    }

    /**
     * getHoTen
     */
    @Test
    public void testGetHoTen() {
        NhanVien instance = new NhanVien();
        final String testValue = "Son";
        instance.setHoTen(testValue);

        String expResult = testValue;
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    /**
     * setHoTen
     */
    @Test
    public void testSetHoTen() {
        NhanVien instance = new NhanVien();
        final String testValue = "Nguyen";
        instance.setHoTen(testValue);

        String expResult = testValue;
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    /**
     * TisVaiTro
     */
    @Test
    public void testIsVaiTro() {
        NhanVien instance = new NhanVien();
        instance.setVaiTro(true);
        assertTrue(instance.isVaiTro());
    }

    /**
     * setVaiTro
     */
    @Test
    public void testSetVaiTro() {
        NhanVien instance = new NhanVien();
        instance.setVaiTro(false);
        assertFalse(instance.isVaiTro());
    }

}
