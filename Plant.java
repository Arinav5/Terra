/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;
import javax.swing.*;

public class Plant {
    private String name;
    private String [] plantInstructions;
    private int waterAfterDays;
    private JPanel plantPanel;
    public Plant(String name, String [] instructions, int days){
        this.name = name;
        plantInstructions = instructions;
        waterAfterDays = days;
    }
    public Plant(String name, int days){
        this.name = name;
        waterAfterDays = days;
    }
    public Plant(String name){
        this.name = name;
    }
    public int getWaterAfterDays(){
        return waterAfterDays;
    }
    public String getName(){
        return name;
    }
    public JPanel getPlantPanel(){
        return plantPanel;
    }
    public static Plant [] simpleToDifficult(Plant [] descending){
        int count = 0;
        for(int i = 0; i<descending.length - 1; i++){
            int minIndex = i;
            for(int j = i+1; j<descending.length; j++){
                if(descending[j].getWaterAfterDays() > descending[minIndex].getWaterAfterDays()){
                    minIndex = j;
                    count++;
                }
            }
            Plant temp = descending[minIndex];
            descending[minIndex] = descending[i];
            descending[i] = temp;
        }
        return descending;
    }
    public static Plant [] difficultToSimple(Plant [] ascending){
        int count = 0;
        for(int i = 1; i<ascending.length; i++){
            int key = ascending[i].getWaterAfterDays();
            int j = i-1;
            while(j>=0 && ascending[j].getWaterAfterDays() > key){
                ascending[j+1] = ascending[j];
                j--;
                count++;
            }
        }
        return ascending;
    }
    public static void main(String [] args){
    }
}
