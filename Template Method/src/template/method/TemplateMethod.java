/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template.method;

/**
 *
 * @author SARAT
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        System.out.println("\nMaking coffee...");
        teaHook.prepareRecipe();
        
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
    
}
