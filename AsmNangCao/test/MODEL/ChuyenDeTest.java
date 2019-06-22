/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class ChuyenDeTest {
    
    public ChuyenDeTest() {
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
     * Test of toString method, of class ChuyenDe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChuyenDe instance = new ChuyenDe();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
<<<<<<< HEAD
        
=======
>>>>>>> 992e63dd90d563956ebe6e8e5c8bae5e82f4f5ed
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
        assertEquals(expResult, result);
        
    }
    
//    @Test(expected = AssertionError.class)
//    public void testGetMaCDfail() {
//        System.out.println("getMaKH fail");
//        ChuyenDe instance = new ChuyenDe();
//        String expResult = null;
//        String result = instance.getMaCD();
//        assertEquals(expResult, result);
//
//    }

    /**
     * Test of setMaCD method, of class ChuyenDe.
     */
    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = null;
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTenCD method, of class ChuyenDe.
     */
    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String tenCD = null;
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
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        double hocPhi = 0.0;
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
        assertEquals(expResult, result);
        
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHinh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String hinh = null;
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String moTa = null;
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(moTa);
        
    }
    
}
