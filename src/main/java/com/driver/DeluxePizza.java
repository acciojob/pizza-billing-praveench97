package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        setExtraCheeseOrdered(true);
        setExtraToppingsOrdered(true);
        addPrice(80);
        if(isVeg){
            addPrice(70);
        }else{
            addPrice(120);
        }
        setToppingAdded(true);
        setCheeseAdded(true);
    }

}
