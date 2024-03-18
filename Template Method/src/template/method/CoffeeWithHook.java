/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SARAT
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput() {
        
        String answer = null;
        
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying yo read your answer");
        }
        
        if(answer == null){
            return "no";
        }
        
        return answer;
    }
    
}
