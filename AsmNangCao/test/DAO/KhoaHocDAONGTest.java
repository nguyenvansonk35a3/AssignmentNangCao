/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.DateHelper;
import HELPER.JDBCHelper;
import MODEL.KhoaHoc;
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

@PrepareForTest({KhoaHocDAO.class, JDBCHelper.class})
public class KhoaHocDAONGTest {

    KhoaHocDAO Khoahocdao;
    KhoaHocDAO KhoahocdaoSpy;

    public KhoaHocDAONGTest() {
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
        Khoahocdao = new KhoaHocDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        KhoahocdaoSpy = PowerMockito.spy(new KhoaHocDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc(10, "PD02292", 150.0, 9, DateHelper.now(), "Lê Văn Khải", "PD02292");
        Khoahocdao.insert(model);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithNullModel() {
        System.out.println("insert with null model");
        KhoaHoc model = null;
        Khoahocdao.insert(model);
    }

    /**
     * Test of update method, of class KhoaHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = new KhoaHoc(10, "PD02292", 150.0, 9, DateHelper.now(), "Khải Lê", "PD02292");
        Khoahocdao.update(model);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("update with null model");
        KhoaHoc model = null;
        Khoahocdao.update(model);
    }

    /**
     * Test of delete method, of class KhoaHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = 1;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(MaKH);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testDeleteNull() {
        System.out.println("delete null");
        Integer MaKH = null;
        KhoaHocDAO instance = null; // new KhoaHocDAO
        instance.delete(MaKH);
    }

    /**
     * Test of select method, of class KhoaHocDAO.
     */
    @Test
    public void testSelect() throws Exception {
        System.out.println("select");
        KhoaHoc expResult = new KhoaHoc();
        List<KhoaHoc> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(KhoahocdaoSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<KhoaHoc> result = KhoahocdaoSpy.select();
        assertThat(result, CoreMatchers.is(resuiltList));

    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSelectNull() {
        System.out.println("select null");
        KhoaHocDAO instance = new KhoaHocDAO();
        List<KhoaHoc> expResult = null;
        List<KhoaHoc> result = instance.select();
        assertEquals(expResult, result);

    }

    /**
     * Test of findById method, of class KhoaHocDAO.
     */
    @Test
    public void testFindByIdNull() throws Exception {
        System.out.println("findById null");
        Integer makh = 0;

        KhoaHoc expResult = null;

        List<KhoaHoc> resultList = new ArrayList<>();
        PowerMockito.doReturn(resultList).when(KhoahocdaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());

        KhoaHoc result = KhoahocdaoSpy.findById(makh);
        assertThat(result, CoreMatchers.is(expResult));

    }

    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        Integer ma = 1;
        KhoaHoc expResult = new KhoaHoc();
        List<KhoaHoc> resuiltList = new ArrayList<>();
        resuiltList.add(expResult);
        PowerMockito.doReturn(resuiltList)
                .when(KhoahocdaoSpy, "select",
                        ArgumentMatchers.anyString(), ArgumentMatchers.any());
        KhoaHoc result = KhoahocdaoSpy.findById(ma);
        assertThat(result, CoreMatchers.is(expResult));
    }

}
