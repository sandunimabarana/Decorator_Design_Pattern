/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishu
 */
public class Cheese extends ToppingDecorator {

    Pizza pizza;
    
    public Cheese(Pizza pizza){
        this.pizza= pizza;
        }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Cheese";
    }

    @Override
    public int getCost() {
        return 500+pizza.getCost();
    }
    
}
