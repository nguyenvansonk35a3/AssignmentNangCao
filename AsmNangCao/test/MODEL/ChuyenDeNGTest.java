package MODEL;

import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
@PrepareForTest({ChuyenDe.class})
public class ChuyenDeNGTest {

    public ChuyenDeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class ChuyenDe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.toString();
        assertEquals(result, expResult);

    }

    /**
     * Test of getMaCD method, of class ChuyenDe.
     */
    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getMaCD();
        assertEquals(result, expResult);

    }

    /**
     * Test of setMaCD method, of class ChuyenDe.
     */
    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(maCD);

    }

    /**
     * Test of getTenCD method, of class ChuyenDe.
     */
    @Test
    public void testGetTenCD() {
        System.out.println("getTenCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getTenCD();
        assertEquals(result, expResult);

    }

    /**
     * Test of setTenCD method, of class ChuyenDe.
     */
    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String tenCD = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(tenCD);

    }

    /**
     * Test of getHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        ChuyenDe instance = new ChuyenDe();
        double expResult = 1.1;
        double result = instance.getHocPhi();
        assertEquals(result, expResult, 1.1);

    }

    /**
     * Test of setHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        double hocPhi = 1.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);

    }

    /**
     * Test of getThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);

    }

    /**
     * Test of setThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testSetThoiLuong() {
        System.out.println("setThoiLuong");
        int thoiLuong = 0;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);

    }

    /**
     * Test of getHinh method, of class ChuyenDe.
     */
    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getHinh();
        assertEquals(result, expResult);

    }

    /**
     * Test of setHinh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String hinh = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(hinh);

    }

    /**
     * Test of getMoTa method, of class ChuyenDe.
     */
    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.getMoTa();
        assertEquals(result, expResult);

    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String moTa = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(moTa);

    }

}
