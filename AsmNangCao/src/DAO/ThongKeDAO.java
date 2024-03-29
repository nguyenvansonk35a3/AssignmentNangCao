/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanbinh
 */
public class ThongKeDAO {
    public List<Object[]> getNguoiHoc(){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try{
                String sql = "{call sp_THONGKENGUOIHOC}";
                rs = JDBCHelper.executeQuery(sql);
                while(rs.next()){
                    Object[] model={
                        rs.getInt("Nam"),
                        rs.getInt("SoLuong"),
                        rs.getDate("DauTien"),
                        rs.getDate("CuoiCung")
                    };
                    list.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return list;
    }
    public List<Object[]> getBangDiem(Integer makh){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try{
                String sql ="{call sp_BANGDIEM(?)}";
                rs = JDBCHelper.executeQuery(sql, makh);
                while(rs.next()){
                    double diem = rs.getDouble("Diem");
                    String xepLoai = "xuât sắc";
                    if (diem <0) {
                        xepLoai ="Chưa nhập";
                    }else if(diem<3){
                        xepLoai = "Kém";
                    }else if (diem<5) {
                        xepLoai = "Yếu";
                    }else if (diem<6.5) {
                        xepLoai = "Trung bình";
                    }else if (diem <7.5) {
                        xepLoai = "Khá";
                    }else if (diem<9) {
                        xepLoai = "Giỏi";
                    }
                    Object[] model={
                        rs.getString("MaNH"),
                        rs.getString("HoTen"),
                        diem,
                        xepLoai
                    };
                    list.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
         return list;
    }
   public List<Object[]> getDiemTheoChuyenDe(){
       List<Object[]> list= new ArrayList<>();
        try {
        ResultSet rs = null;
        try {
            String sql="{call sp_ThongKeDiem}";
            rs = JDBCHelper.executeQuery(sql);
        while(rs.next()){
            Object[] model={
            rs.getString("ChuyenDe"),
            rs.getInt("SoHV"),
            rs.getDouble("CaoNhat"),
            rs.getDouble("ThapNhat"),
            rs.getDouble("TrungBinh")
        };
        list.add(model);
        }
        }
        finally{
            rs.getStatement().getConnection().close();
        }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;

   }
   public List<Object[]> getDoanhThu(int nam){
        List<Object[]> list=new ArrayList<>();
        try {
            ResultSet rs = null;
        try {
            String sql="{call  sp_THONGKEDANHTHU (?)}";
            rs = JDBCHelper.executeQuery(sql, nam);
        while(rs.next()){
            Object[] model={
            rs.getString("ChuyenDe"),
            rs.getInt("SoKH"),
            rs.getInt("SoHV"),
            rs.getDouble("DoanhThu"),
            rs.getDouble("ThapNhat"),
            rs.getDouble("CaoNhat"),
            rs.getDouble("TrungBinh")
          };
            list.add(model);
         }
        }
        finally{
            rs.getStatement().getConnection().close();
        }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
             return list;
        }
}
