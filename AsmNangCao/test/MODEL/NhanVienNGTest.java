package MODEL;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NhanVienNGTest {

    public NhanVienNGTest() {
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
     * Test of toString 
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.toString();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMaNV 
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NhanVien instance = new NhanVien();
        String expResult = null;
        String result = instance.getMaNV();
        assertEquals(result, expResult);
    }

    /**
     * Test of setMaNV 
     */
    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
    }

    /**
     * Test of getMatkhau 
     */
    @Test
    public void testGetMatkhau() {
        System.out.println("getMatkhau");
        NhanVien instance = new NhanVien();
        String expResult = "123";
        String result = instance.getMatkhau();
        assertEquals(result, expResult);
    }

    /**
     * Test of setMatkhau 
     */
    @Test
    public void testSetMatkhau() {
        System.out.println("setMatkhau");
        String matkhau =  null;
        NhanVien instance = new NhanVien();
        instance.setMatkhau(matkhau);
    }

    /**
     * Test of getHoTen 
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NhanVien instance = new NhanVien();
        String expResult = "Van Son";
        String result = instance.getHoTen();
        assertEquals(result, expResult);
    }

    /**
     * Test of setHoTen 
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
    }

    /**
     * Test of isVaiTro 
     */
    @Test
    public void testIsVaiTro() {
        System.out.println("isVaiTro");
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.isVaiTro();
        assertEquals(result, expResult);
    }

    /**
     * Test of setVaiTro 
     */
    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
    }

}
