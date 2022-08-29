/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherikerucut;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class lingkaran {
    public double Jari ;
    public double Garis ;
    public void setJari(double nilaiBaru){
        this.Jari=nilaiBaru;
    }
    public void setGaris(double nilaiBaru){
        this.Garis=nilaiBaru;
    }
    public double luaslingkaran(){
        return 3.14 * Jari * Jari ;
    }
    
    public double luaspermukaankerucut(){
        return 3.14 * Jari * Jari + ( 3.14 * Jari * Garis);
    }
}
