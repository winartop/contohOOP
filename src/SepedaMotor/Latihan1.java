/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SepedaMotor;

/**
 *
 * @author o
 */
public class Latihan1 {
    
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("Suzuki");
        motor.setTipe("New Z");
        
        System.out.println("motor ini bermerk : "+motor.getMerk());
        System.out.println("motor ini bertipe : "+motor.getTipe());
    }
    
}
