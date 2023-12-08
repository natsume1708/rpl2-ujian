/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package act4_adamrj;

import javax.swing.table.TableModel;

/**
 *
 * @author Acer
 */
public class karyawanbaru {
    private final String nama;
    private final String nim;
    final int umur;
    private final String tempatLahir;
    final int tanggalLahir;
    private final String domisili;
    

    public karyawanbaru (String nama,  String nim, int umur, String tempatLahir,int tanggalLahir, String domisili  ){
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.domisili = domisili;
    }
    
     public String getNama() {
        return nama;
    }
      
    public String getNim() {
        return nim;
    }
    
     public int getUmur() {
        return umur;
    }
     
     public String getTempatLahir() {
        return tempatLahir;
    }
     
     public int getTanggalLahir() {
        return tanggalLahir;
    }
     
     public String getDomisili() {
        return domisili;
    }
     
     @Override
     public String toString(){
        return "Nama:" + nama +", Nomor Pegawai: " + nim  + ", Umur: " + umur;
    }

}
