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
 * @author PC
 */
public class HocVienTest {
    
    public HocVienTest() {
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
     * Test of toString method, of class HocVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HocVien instance = new HocVien();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getMaHV method, of class HocVien.
     */
    @Test
    public void testGetMaHV() {
        System.out.println("getMaHV");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaHV();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetMaHVfail() {
        System.out.println("getMaHVfail");
        HocVien instance = new HocVien();
        int expResult = -1;
        int result = instance.getMaHV();
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of setMaHV method, of class HocVien.
     */
    @Test
    public void testSetMaHV() {
        System.out.println("setMaHV");
        int maHV = 0;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
    
    }
    
    /**
     * Test of getMaKH method, of class HocVien.
     */
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);
    }


    /**
     * Test of setMaKH method, of class HocVien.
     */
    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 0;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
    }

    /**
     * Test of getMaNH method, of class HocVien.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        HocVien instance = new HocVien();
        String expResult = null;
        String result = instance.getMaNH();
        assertEquals(expResult, result);
    }
 

    /**
     * Test of setMaNH method, of class HocVien.
     */
    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "";
        HocVien instance = new HocVien();
        instance.setMaNH(maNH);
    }

    /**
     * Test of getDiem method, of class HocVien.
     */
    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        HocVien instance = new HocVien();
        double expResult = -1.0;
        double result = instance.getDiem();
        assertEquals(expResult, result, 0.0);
    }
        @Test
    public void testGetDiemfail() {
        System.out.println("getDiemfail");
        HocVien instance = new HocVien();
        double expResult = 0.1;
        double result = instance.getDiem();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDiem method, of class HocVien.
     */
    @Test
    public void testSetDiem() {
        System.out.println("setDiem");
        double diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
    
    }
    
}
