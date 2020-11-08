/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> directory;
    
    public ChangeHistory() {
        this.directory = new ArrayList();
    }
    
    public void add(double status) {
        this.directory.add(status);
    }
    
    public void clear() {
        this.directory.clear();
    }
    
    public String toString() {
        return this.directory.toString();
    }
    
    public double maxValue() {
        double max = this.directory.get(0);
        for (double i: this.directory) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = this.directory.get(0);
        for (double i: this.directory) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public double average() {
        double sum = 0.0;
        for (double i: this.directory) {
            sum += i;
        }
        return sum/this.directory.size();
    }
}
