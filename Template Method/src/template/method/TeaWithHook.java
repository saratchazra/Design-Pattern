package template.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SARAT
 */
public class TeaWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
       
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
    
        System.out.println("Adding Lemon");
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
        
        System.out.println("Would you like lemon with your tea (y/n)?");
        
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
