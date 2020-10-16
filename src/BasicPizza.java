/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishu
 */
public class BasicPizza extends Pizza {

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public int getCost() {
        return 1000;
    }
    
}
