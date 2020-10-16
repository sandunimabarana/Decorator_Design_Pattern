/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishu
 */
public class PizzaStore {

    public static void main(String[] args) {
        //create new basic pizza
        Pizza pizza = new BasicPizza();
        
        System.out.println(pizza.getDescription()+ "Cost:"+ pizza.getCost());
        
        Cheese pizza1 = new Cheese(pizza);
        
        Tomato pizza2 = new Tomato(pizza1);
        
        System.out.println(pizza1.getDescription()+ "Cost" +pizza1.getCost());
        System.out.println(pizza2.getDescription()+ "Cost" +pizza2.getCost());
    }
}
