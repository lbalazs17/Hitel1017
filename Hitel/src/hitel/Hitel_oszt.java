/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitel;

/**
 *
 * @author user11
 */
public class Hitel_oszt {
    private double kamat;
    private int fosszeg;
    private int eveksz;
    private final double kkoltseg = 0.0005;

    public Hitel_oszt(double kamat, int fosszeg, int eveksz) {
        this.kamat = kamat;
        this.fosszeg = fosszeg;
        this.eveksz = eveksz;
    }
    
    public double visszafizet()
    {
        double vfizet = fosszeg + (fosszeg*kamat) + (fosszeg * kkoltseg);
    return vfizet;
    
    }
    public double torleszto()
    {
    return visszafizet() / (eveksz * 12);
    }
    
}
