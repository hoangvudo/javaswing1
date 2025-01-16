/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlypizza.DAO;

import com.mycompany.quanlypizza.model.loaiSanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class loaiSPDAOimpl implements loaiSPDAO{
    public List<loaiSanPham> getList() { 
         ArrayList<loaiSanPham> list = new ArrayList<>(); 
         Connection conn = DBconnect.getConnection(); 
        try { 
            Statement stmt = conn.createStatement(); 
            // get data from table  
            String sql = "select * from loai"; 
            ResultSet rs = stmt.executeQuery(sql); 
            //show data 
        while (rs.next()) { 
                loaiSanPham lsp = new loaiSanPham();
                   lsp.setMaLoai(rs.getString(1));
                   lsp.setTenLoai(rs.getString(2));
                   list.add(lsp);
            } 
            rs.close(); 
            conn.close(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return list;
    }
}
