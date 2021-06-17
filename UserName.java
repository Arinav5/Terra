/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;
import java.util.ArrayList;
/**
 *
 * @author varda
 */
public class UserName {
    

    private ArrayList<String> possibleNames;
    public UserName(String firstName, String lastName){
        for(int i = 0; i<firstName.length();i++){
            possibleNames.add(lastName + firstName.substring(i, i+1));
        }
        System.out.println(possibleNames);
    }

    public static void main(String[] args) {
        UserName john = new UserName("john", "smith");
    }


}
