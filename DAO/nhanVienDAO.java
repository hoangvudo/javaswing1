/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quanlypizza.DAO;

import com.mycompany.quanlypizza.model.NhanVien;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface nhanVienDAO {
     public List<NhanVien> getList();
public List<NhanVien> findName (String maNhanVien);
public boolean insert (NhanVien nv);
public boolean update (NhanVien nv);
public boolean delete (NhanVien nv);
}
