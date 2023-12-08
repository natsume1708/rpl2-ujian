/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act4_adamrj;

import java.awt.MenuComponent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author user
 */
public class ControllerMahasiswa {
    ArrayList<karyawanbaru> ArrayData;
    DefaultTableModel tablelist; 
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<karyawanbaru>();
    }
    
    public void InsertData(String nama, String nim, int umur, String tempatLahir, int tanggalLahir, String domisili){
        karyawanbaru karyawan;
        karyawan = new karyawanbaru(nama,nim,umur,tempatLahir,tanggalLahir,domisili);
        ArrayData.add(karyawan);
    }
    
    public void HapusData(int rowIndex){
        if(rowIndex>=0 && rowIndex<ArrayData.size()){
            ArrayData.remove(rowIndex);
        }
    }
    
    public void UpdateData(int rowIndex){
        
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Nama", "Nim", "Umur", "`Tempat Lahir", "Tanggal Lahir", "Domisili"};
        Object[][] objData = new Object[ArrayData.size()] [6];
        int i = 0;
        
        for(karyawanbaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getNim(), String.valueOf(n.umur), n.getTempatLahir(), String.valueOf(n.tanggalLahir), n.getDomisili()};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }
       
    
}

