/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlypizza.DAO;

import com.mycompany.quanlypizza.model.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class nhanVienDAOimpl implements nhanVienDAO{
    public List<NhanVien> getList() { 
         ArrayList<NhanVien> list = new ArrayList<>(); 
         Connection conn = DBconnect.getConnection(); 
        try { 
            Statement stmt = conn.createStatement(); 
            // get data from table  
            String sql = "select * from sanpham"; 
            ResultSet rs = stmt.executeQuery(sql); 
            //show data 
        while (rs.next()) { 
                NhanVien nv = new NhanVien(); 
                nv.setMaNhanVien(rs.getString("MaNhanVien")); 
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setLuong(rs.getInt("Luong"));
                list.add(nv); 
            } 
            rs.close(); 
            conn.close(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return list;
}

    @Override
    public List<NhanVien> findName(String maNhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert(NhanVien nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVien nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NhanVien nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
