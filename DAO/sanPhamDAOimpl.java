/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlypizza.DAO;


import com.mycompany.quanlypizza.model.sanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrator
 */
public class sanPhamDAOimpl implements sanPhamDAO{
   @Override 
    public List<sanPham> getList() { 
         ArrayList<sanPham> list = new ArrayList<>(); 
         Connection conn = DBconnect.getConnection(); 
        try { 
            Statement stmt = conn.createStatement(); 
            // get data from table  
            String sql = "select * from sanpham"; 
            ResultSet rs = stmt.executeQuery(sql); 
            //show data 
        while (rs.next()) { 
                sanPham sp = new sanPham(); 
                sp.setMaSP(rs.getString("MaSanPham")); 
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setMaLoai(rs.getString("Maloai"));
                sp.setDonGia(rs.getInt("Gia"));
                sp.setSoLuong(rs.getString("SoLuongTon"));
                list.add(sp); 
            } 
            rs.close(); 
            conn.close(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return list;
    }

    @Override
    public List<sanPham> findName(String tenSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert(sanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(sanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(sanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}