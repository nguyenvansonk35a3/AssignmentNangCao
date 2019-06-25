package DAO;

import HELPER.JDBCHelper;
import MODEL.NhanVien;
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
 * @author ADMIN
 */
@PrepareForTest({NhanVienDAO.class, JDBCHelper.class})
public class NhanVienDAONGTest {

    NhanVienDAO nhanVienDao;
    NhanVienDAO nhanVienDaoSpy;

    public NhanVienDAONGTest() {
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
        nhanVienDao = new NhanVienDAO();
        PowerMockito.mockStatic(JDBCHelper.class);
        nhanVienDaoSpy = PowerMockito.spy(new NhanVienDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NhanVien model = new NhanVien("ps07564", "123", "Van Son", true);
        nhanVienDao.insert(model);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithNullModel() {
        System.out.println("insert with null model");
        NhanVien model = null;
        nhanVienDao.insert(model);
    }

    /**
     * Test of update
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien model = new NhanVien("ps07564", "456", "Van Son", true);
        nhanVienDao.update(model);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithNullModel() {
        System.out.println("update with null model");
        NhanVien model = null;
        nhanVienDao.update(model);
    }

    /**
     * Test of delete
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = "003";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testDeleteNull() {
        System.out.println("delete null");
        Integer MaKH = null;
        KhoaHocDAO instance = null; // new NhanVienDAO
        instance.delete(MaKH);
    }

    /**
     * Test of select
     */
    @Test
    public void testSelect_0args() throws Exception {
        System.out.println("select");
        NhanVien nhanVien = new NhanVien();
        List<NhanVien> expectedResult = new ArrayList<>();

        expectedResult.add(nhanVien);

        PowerMockito.doReturn(expectedResult).when(nhanVienDaoSpy, "select", ArgumentMatchers.anyString());
        List<NhanVien> result = nhanVienDaoSpy.select();
        assertThat(result, CoreMatchers.is(expectedResult));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSelectNull() {
        System.out.println("select null");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.select();
        assertEquals(expResult, result);
    }

    /**
     * Test of findByld 
     */
    @Test
    public void testFindByld() {
        System.out.println("findByld");
        String manv = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.findByld(manv);
        assertEquals(result, expResult);
    }

    /**
     * Test of select 
     */
//    @Test
//    public void testSelect_String_ObjectArr() {
//        System.out.println("select");
//        String sql = "";
//        Object[] args = null;
//        NhanVienDAO instance = new NhanVienDAO();
//        List expResult = null;
//        List result = instance.select(sql, args);
//        assertEquals(result, expResult);
//    }
//
//    /**
//     * Test of checkID 
//     */
//    @Test
//    public void testCheckID() {
//        System.out.println("checkID");
//        String id = "";
//        NhanVienDAO instance = new NhanVienDAO();
//        boolean expResult = false;
//        boolean result = instance.checkID(id);
//        assertEquals(result, expResult);
//    }

}
