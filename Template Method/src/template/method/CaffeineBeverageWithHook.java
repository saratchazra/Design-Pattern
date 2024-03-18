/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

/**
 *
 * @author SARAT
 */
public abstract class CaffeineBeverageWithHook {
    
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    
    abstract void brew();
    abstract void addCondiments();
    
    void boilWater(){
        System.out.println("Boiling Water");
    }
    
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsCondiments(){
        return true;
    }
}
