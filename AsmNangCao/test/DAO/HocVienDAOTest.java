/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.HocVien;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import HELPER.JDBCHelper;
import java.util.ArrayList;
import org.hamcrest.CoreMatchers;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;

/**
 *
 * @author PC
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JDBCHelper.class, HocVienDAO.class})
public class HocVienDAOTest {

    HocVienDAO hocVienDAO;
    HocVienDAO hocVienDAOSpy;

    public HocVienDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        hocVienDAO = new HocVienDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        hocVienDAOSpy = PowerMockito.spy(new HocVienDAO());
    }

    @After
    public void tearDown() {
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

    @Test(expected = NullPointerException.class)
    public void testInsertWithNullModel() {
        System.out.println("Insert with null model");
        HocVien model = null;
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
    @Test(expected = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("Update with null model");
        HocVien model = null;
        hocVienDAO.update(model);
    }
    /**
     * Test of delete method, of class HocVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        HocVienDAO instance = new HocVienDAO();
        instance.delete(MaHV);
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
    public void testFindByIdWithNotFound() throws Exception {
        System.out.println("findById");
        Integer mahv = null;
        HocVien expResult = null;
        List<HocVien> resultList = new ArrayList<>();
        resultList.add(expResult);
        PowerMockito.doReturn(resultList)
                .when(hocVienDAOSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        HocVien result = hocVienDAOSpy.findById(mahv);
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        Integer mahv = 12;
        HocVien expResult = new HocVien();
        List<HocVien> resultList = new ArrayList<>();
        resultList.add(expResult);
        PowerMockito.doReturn(resultList)
                .when(hocVienDAOSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        HocVien result = hocVienDAOSpy.findById(mahv);
        assertThat(result, CoreMatchers.is(expResult));
    }

}
