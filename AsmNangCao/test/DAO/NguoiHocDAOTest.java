/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import MODEL.NguoiHoc;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author tanbinh
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JDBCHelper.class, NguoiHocDAO.class})
public class NguoiHocDAOTest {
    NguoiHocDAO nguoiHocDAO;
    NguoiHocDAO nguoiHocDAOSpy;
    
    @Before
    public void setUp() {
        nguoiHocDAO = new NguoiHocDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        nguoiHocDAOSpy = PowerMockito.spy(new NguoiHocDAO());
    }
    @Test
    public void testInsert() {
        System.out.println("insert");
        NguoiHoc model = new NguoiHoc();
     
        nguoiHocDAO.insert(model);
    }
    
    @Test(expected = NullPointerException.class)
    public void testInsertWithNullModel(){
        System.out.println("Insert with null model");
        NguoiHoc model = null;
        nguoiHocDAO.insert(model);
                
    }
    /**
     * Test of update method, of class NguoiHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        
        NguoiHoc model = new NguoiHoc();
        nguoiHocDAO.update(model);
    }
    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel(){
        System.out.println("update with null model");
        NguoiHoc model = null;
        nguoiHocDAO.update(model);
    }
    /**
     * Test of delete method, of class NguoiHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String maNH = "";
        nguoiHocDAO.delete(maNH);
    }
//    @Test
//    public void test

    /**
     * Test of select method, of class NguoiHocDAO.
     */
    @Test
    public void testSelect() throws  Exception{
        System.out.println("select");
        NguoiHoc nguoiHoc = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString());
        List<NguoiHoc> result = nguoiHocDAOSpy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testSelectWithNull() throws  Exception{
        System.out.println("select with null");
        NguoiHoc nguoiHoc = null;
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString());
        List<NguoiHoc> result = nguoiHocDAOSpy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of selectByKeyword method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByKeyword()throws Exception{
        System.out.println("selectByKeyword");
        String Hoten = "binh";
        NguoiHoc nguoiHoc = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByKeyword(Hoten);
        assertThat( result, CoreMatchers.is(expResult));
    }
    @Test
    public void testSelectByKeywordWithNull()throws Exception{
        System.out.println("selectByKeyword with null");
        String Hoten = null;
        NguoiHoc nguoiHoc = null;
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByKeyword(Hoten);
        assertThat( result, CoreMatchers.is(expResult));
    }

    /**
     * Test of selectByCourse method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByCourse() throws Exception{
        System.out.println("selectByCourse");
        Integer makh = 45;
        NguoiHoc nguoiHoc = new NguoiHoc();
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByCourse(makh);
        assertThat( result, CoreMatchers.is(expResult));
    }
    
    @Test
    public void testSelectByCourseWithNull() throws Exception{
        System.out.println("selectByCourse with null");
        Integer makh = null;
        NguoiHoc nguoiHoc = null;
        List<NguoiHoc> expResult = new ArrayList<>();
        expResult.add(nguoiHoc);
        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(),ArgumentMatchers.any());
        List<NguoiHoc> result = nguoiHocDAOSpy.selectByCourse(makh);
        assertThat( result, CoreMatchers.is(expResult));
    }
    
    /**
     * Test of findById method, of class NguoiHocDAO.
     */
    @Test
    public void testFindById() throws Exception{
        System.out.println("findById");
        String manh = "d1";
        NguoiHoc expResult = null;
        List<NguoiHoc> resultList = new ArrayList<>();
        PowerMockito.doReturn(resultList).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        NguoiHoc result = nguoiHocDAOSpy.findById(manh);
        assertThat(result, CoreMatchers.is(expResult));
    }
     @Test
    public void testFindByIdWithNull() throws Exception{
        System.out.println("findById with null");
        String manh = null;
        NguoiHoc expResult = null;
        List<NguoiHoc> resultList = new ArrayList<>();
        PowerMockito.doReturn(resultList).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        NguoiHoc result = nguoiHocDAOSpy.findById(manh);
        assertThat(result, CoreMatchers.is(expResult));
    }

    /**
     * Test of checkID method, of class NguoiHocDAO.
     */
//    @Test
//    public void testCheckID() throws Exception{
//        System.out.println("checkID");
//        String id = "nh02";
//        NguoiHoc expResult = null;
//        List<NguoiHoc> resultList = new ArrayList<>();
//        PowerMockito.doReturn(expResult).when(nguoiHocDAOSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
//        NguoiHoc result = nguoiHocDAOSpy.checkID(id);
//        assertThat(result, CoreMatchers.is(expResult));
//    }
//
    /**
     * Test of checkSDT method, of class NguoiHocDAO.
     */
//    @Test
//    public void testCheckSDT() {
//        System.out.println("checkSDT");
//        String sodienthoai = "";
//        NguoiHocDAO instance = new NguoiHocDAO();
//        boolean expResult = false;
//        boolean result = instance.checkSDT(sodienthoai);
//        assertEquals(expResult, result);
//    }
//    
}
