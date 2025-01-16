/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlypizza.service;
import com.mycompany.quanlypizza.DAO.sanPhamDAO;
import com.mycompany.quanlypizza.DAO.sanPhamDAOimpl;
import com.mycompany.quanlypizza.model.sanPham;
import java.util.List;


/**
 *
 * @author Administrator
 */
public class sanPhamServiceimpl implements sanPhamService {
    private sanPhamDAO SanPhamDAO = null;
    public sanPhamServiceimpl(){
    this.SanPhamDAO = new sanPhamDAOimpl();
    }

    @Override
    public List<sanPham> getList() {
        return SanPhamDAO.getList();
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
    public boolean delete(String masp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
