/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlypizza.service;
import com.mycompany.quanlypizza.DAO.loaiSPDAO;

import com.mycompany.quanlypizza.DAO.loaiSPDAOimpl;
import com.mycompany.quanlypizza.model.loaiSanPham;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class loaiSPServiceimpl implements loaiSPService{
    private loaiSPDAO LoaiSP = null; 
    public loaiSPServiceimpl(){
    this.LoaiSP = new loaiSPDAOimpl();
}

    @Override
    public List<loaiSanPham> getList() {
        return LoaiSP.getList();
    }
    
}
