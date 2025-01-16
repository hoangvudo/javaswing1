/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quanlypizza.service;
import com.mycompany.quanlypizza.model.sanPham;


import java.util.List;

/**
 *
 * @author Administrator
 */
public interface sanPhamService {
     public List<sanPham> getList();
public List<sanPham> findName (String tenSanPham);
public boolean insert (sanPham sp);
public boolean update (sanPham sp);
public boolean delete (String masp);
}
