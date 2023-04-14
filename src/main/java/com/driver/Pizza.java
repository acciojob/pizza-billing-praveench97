package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isExtraCheeseOrdered;
    private boolean isExtraToppingsOrdered;
    private boolean isTakeAwayOrder;
    private boolean isToppingAdded = false;
    private boolean isCheeseAdded = false;
    private boolean isTakeAwayAdded = false;
    private String bill;

    public void setExtraCheeseOrdered(boolean extraCheeseOrdered) {
        isExtraCheeseOrdered = extraCheeseOrdered;
    }

    public void setExtraToppingsOrdered(boolean extraToppingsOrdered) {
        isExtraToppingsOrdered = extraToppingsOrdered;
    }

    public void setToppingAdded(boolean toppingAdded) {
        isToppingAdded = toppingAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
        }else{
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addPrice(int amount) {
        this.price += amount;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            price += 80;
            isExtraCheeseOrdered = true;
        }
        setCheeseAdded(true);
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
        }
        isExtraToppingsOrdered = true;
        setToppingAdded(true);
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded)
            price += 20;
        isTakeAwayOrder = true;
        isTakeAwayAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
            bill = "Base Price Of The Pizza: 300\n";
        else
            bill = "Base Price Of The Pizza: 400\n";
        if(isExtraCheeseOrdered){
            bill += "Extra Cheese Added: 80\n";
        }
        if(isExtraToppingsOrdered){
            if(isVeg)
                bill += "Extra Toppings Added: 70\n";
            else
                bill += "Extra Toppings Added: 120\n";
        }
        if(isTakeAwayOrder){
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: "+price+"\n";

        return this.bill;
    }
}

//        Base Price Of The Pizza: 300\
//        Extra Cheese Added: 80\
//        Extra Toppings Added: 70\
//        Paperbag Added: 20\
//        Total Price: 470
