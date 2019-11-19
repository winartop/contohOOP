package SepedaMotor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author o
 */
public class SepedaMotor {
    
    private String merk, tipe;
    private int tangki;
    private long harga;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setTipe(String tipe){
        this.tipe=tipe;
    }
    
    public String getTipe(){
        return tipe;
    }
    
}
