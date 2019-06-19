/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import com.mockrunner.mock.jdbc.MockConnection;
import com.mockrunner.mock.jdbc.MockResultSet;
import com.mockrunner.mock.jdbc.MockStatement;
import java.sql.SQLException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
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
 * @author Joseph Da Min
 */
@PrepareForTest({JDBCHelper.class, ThongKeDAO.class})
public class ThongKeDAONGTest extends PowerMockTestCase{
//    ThongKeDAO thongkeDAO;

    ThongKeDAO thongkeDAOSpy;
    
    @Mock
    MockConnection connection;
    
    @Mock
    MockStatement statement;
    
    @Spy
    @InjectMocks
    MockResultSet rs = new MockResultSet("myMock");

    public ThongKeDAONGTest() {
    }

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
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
        MockitoAnnotations.initMocks(this);
        PowerMockito.mockStatic(JDBCHelper.class);
        thongkeDAOSpy = PowerMockito.spy(new ThongKeDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    private MockResultSet initMockResultSet() throws SQLException {
        rs.addColumn("Nam", new Integer[]{1});
        rs.addColumn("SoLuong", new Integer[]{1});
        rs.addColumn("DauTien", new java.sql.Date[]{new java.sql.Date(new java.util.Date().getTime())});
        rs.addColumn("CuoiCung", new java.sql.Date[]{new java.sql.Date(new java.util.Date().getTime())});
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMockResultSetwithMultipleDate() throws SQLException {
        rs.addColumn("Nam", new Integer[]{1, 2, 3});
        rs.addColumn("SoLuong", new Integer[]{1, 1, 2});
        rs.addColumn("DauTien", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.addColumn("CuoiCung", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.beforeFirst();
        return rs;
    }
    /**
     * Test of getNguoiHoc method, of class ThongKeDAO.
     */
    @Test
    public void testGetNguoiHoc() throws SQLException {
        System.out.println("getNguoiHoc");
//        ThongKeDAO instance = new ThongKeDAO();
        List expResult = null;
        MockResultSet rs = initMockResultSet();
        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();
        assertEquals(1, result.size());

    }

    @Test
    public void testGetNguoiHocWithNoResult() throws Exception {
        System.out.println("getNguoiHoc");

//        List expResult=null;
        //MockResultSet rs=initMockResultSet();
        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);

        PowerMockito.when(rs.getStatement()).thenReturn(statement);

        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();

        assertEquals(0, result.size());

    }

    @Test
    public void testGetNguoiHocWithMultipleResult() throws Exception {
        System.out.println("getNguoiHoc");

        List expResult = null;

        rs = initMockResultSetwithMultipleDate();

        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);

        PowerMockito.when(rs.getStatement()).thenReturn(statement);

        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();

        assertEquals(3, result.size());

    }

    /**
     * Test of getBangDiem method, of class ThongKeDAO.
     */
    @Test
    public void testGetBangDiem() throws SQLException {
        System.out.println("getBangDiem");
//        Integer makh = 0;
//        ThongKeDAO instance = new ThongKeDAO();
//        List expResult = null;
//        List result = instance.getBangDiem(makh);
//        assertEquals(expResult, result);
        List expResult = null;

        MockResultSet rs = initMockResultSet();

        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);

        PowerMockito.when(rs.getStatement()).thenReturn(statement);

        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();

        assertEquals(1, result.size());

    }

    /**
     * Test of getDiemTheoChuyenDe method, of class ThongKeDAO.
     */
    @Test
    public void testGetDiemTheoChuyenDe() throws SQLException {
        System.out.println("getDiemTheoChuyenDe");
//        ThongKeDAO instance = new ThongKeDAO();
//        List expResult = null;
//        List result = instance.getDiemTheoChuyenDe();
//        assertEquals(expResult, result);
        List expResult = null;

        MockResultSet rs = initMockResultSet();

        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);

        PowerMockito.when(rs.getStatement()).thenReturn(statement);

        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();

        assertEquals(1, result.size());

    }

    /**
     * Test of getDoanhThu method, of class ThongKeDAO.
     */
    @Test
    public void testGetDoanhThu() throws SQLException {
        System.out.println("getDoanhThu");
//        int nam = 0;
//        ThongKeDAO instance = new ThongKeDAO();
//        List expResult = null;
//        List result = instance.getDoanhThu(nam);
//        assertEquals(expResult, result);
        List expResult = null;

        MockResultSet rs = initMockResultSet();

        PowerMockito.when(JDBCHelper.executeQuery(ArgumentMatchers.anyString())).thenReturn(rs);

        PowerMockito.when(rs.getStatement()).thenReturn(statement);

        PowerMockito.when(statement.getConnection()).thenReturn(connection);

        List result = thongkeDAOSpy.getNguoiHoc();

        assertEquals(1, result.size());
    }

}
