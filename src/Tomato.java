/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishu
 */
public class Tomato extends ToppingDecorator{

    Pizza pizza;
    
    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription()+"with Tomato";
    }

    @Override
    public int getCost() {
        return 400+ pizza.getCost(); 
    }
    
}
