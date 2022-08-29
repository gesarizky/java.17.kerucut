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
public class kerucut extends lingkaran {
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumekerucut (){
        return (luaslingkaran()*Tinggi)/3;
    }
}
