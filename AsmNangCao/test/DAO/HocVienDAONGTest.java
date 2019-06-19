/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.HocVien;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertThat;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author PC
 */
@PrepareForTest({JDBCHelper.class, HocVienDAO.class})
public class HocVienDAONGTest {
    HocVienDAO hocVienDAO;
    HocVienDAO hocVienDAOSpy;
    
    public HocVienDAONGTest() {
    }
@ObjectFactory
public IObjectFactory getObjectFactory(){
    return new org.powermock.modules.testng.PowerMockObjectFactory();
}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        hocVienDAO = new HocVienDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        hocVienDAO = PowerMockito.spy(new HocVienDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class HocVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
       HocVien model = new HocVien();
       hocVienDAO.insert(model);

    }

    /**
     * Test of update method, of class HocVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        HocVien model = new HocVien();
        hocVienDAO.update(model);
       

    }

    /**
     * Test of delete method, of class HocVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        hocVienDAO.delete(MaHV);
      
    }

    /**
     * Test of select method, of class HocVienDAO.
     */
    @Test
    public void testSelect() throws Exception {
       System.out.println("select");
        HocVien hocVien = new HocVien();
        List<HocVien> expectedResult = new ArrayList<>();
        expectedResult.add(hocVien);
        PowerMockito.doReturn(expectedResult)
                .when(hocVienDAOSpy, "select", ArgumentMatchers.anyString());
        List<HocVien> result = hocVienDAOSpy.select();
        assertThat(result, CoreMatchers.is(expectedResult));
    }

    /**
     * Test of findById method, of class HocVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer mahv = null;
        HocVienDAO instance = new HocVienDAO();
        HocVien expResult = null;
        HocVien result = instance.findById(mahv);
        assertEquals(result, expResult);
    }
    
}
