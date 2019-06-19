/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.ChuyenDe;
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
 * @author DELL
 */
@PrepareForTest({JDBCHelper.class,ChuyenDeDAO.class})
public class ChuyenDeDAONGTest {
    ChuyenDeDAO chuyenDeDAO;
    ChuyenDeDAO chuyenDeDAOSpy;
    
    public ChuyenDeDAONGTest() {
    }

    @ObjectFactory
    public IObjectFactory getObjectFfactory() {
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
        chuyenDeDAO = new ChuyenDeDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        chuyenDeDAOSpy = PowerMockito.spy(new ChuyenDeDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class ChuyenDeDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe model = new ChuyenDe();
        chuyenDeDAO.insert(model);
        
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithModel(){
        System.out.println("insert with null model");
        ChuyenDe model = null;
        chuyenDeDAO.insert(model);
    }
    

    /**
     * Test of update method, of class ChuyenDeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = new ChuyenDe();
        chuyenDeDAO.update(model);
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithModel(){
        System.out.println("update with null model");
        ChuyenDe model = null;
        chuyenDeDAO.update(model);
    }
    

    /**
     * Test of delete method, of class ChuyenDeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaCD = "1";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        instance.delete(MaCD);
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testDeleteNull(){
        System.out.println("delete null");
        String MaCD = null;
        ChuyenDeDAO instance = null;
        instance.delete(MaCD);
    }
    /**
     * Test of select method, of class ChuyenDeDAO.
     */
    @Test
    public void testSelect_0args() throws Exception {
        System.out.println("select");
        ChuyenDe expResult = new ChuyenDe();
        List<ChuyenDe> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList).when(chuyenDeDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSelectNull(){
        System.out.println("select null");
        ChuyenDeDAO instance = new ChuyenDeDAO();
        List<ChuyenDe> exResult = null;
        List<ChuyenDe> result = instance.select();
        assertEquals(exResult, result);
    }
    /**
     * Test of findById method, of class ChuyenDeDAO.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        String macd = "1";
        KhoaHocDAO instance = new KhoaHocDAO();
        ChuyenDe expResult = new ChuyenDe();
        List<ChuyenDe> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(chuyenDeDAOSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        ChuyenDe result = chuyenDeDAOSpy.findById(macd);
        assertThat(result, CoreMatchers.is(expResult));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testFindByIdNull(){
        System.out.println("findById null");
        String macd = "0";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = null;
        ChuyenDe result = instance.findById(macd);
        assertEquals(expResult, result);
    }
    /**
     * Test of findByName method, of class ChuyenDeDAO.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String tencd = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = new ChuyenDe();
        List<ChuyenDe> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(chuyenDeDAOSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        ChuyenDe result = chuyenDeDAOSpy.findById(tencd);
        assertThat(result, CoreMatchers.is(expResult));
    }
    
    @Test(expectedExceptions = NullPointerException.class)
    public void testFindByNameNull(){
        System.out.println("findById null");
        String tencd = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        ChuyenDe expResult = null;
        ChuyenDe result = instance.findById(tencd);
        assertEquals(expResult, result);
    }

    /**
     * Test of select method, of class ChuyenDeDAO.
     */
//    @Test
//    public void testSelect_String_ObjectArr() {
//        System.out.println("select");
//        String sql = "";
//        Object[] args = null;
//        ChuyenDeDAO instance = new ChuyenDeDAO();
//        List expResult = null;
//        List result = instance.select(sql, args);
//        assertEquals(result, expResult);
//        
//    }
//
//    /**
//     * Test of checkID method, of class ChuyenDeDAO.
//     */
//    @Test
//    public void testCheckID() {
//        System.out.println("checkID");
//        String id = "";
//        ChuyenDeDAO instance = new ChuyenDeDAO();
//        boolean expResult = false;
//        boolean result = instance.checkID(id);
//        assertEquals(result, expResult);
//        
//    }
//    
}
