package com.avci.basithesapmakinesi;

public class Calculate {

    private int incomingnumber1, incomingnumber2;


    public Calculate(int incomingnumber1, int incomingnumber2) {
        this.incomingnumber1 = incomingnumber1;
        this.incomingnumber2 = incomingnumber2;
    }

    public int plus(){
        return incomingnumber1 + incomingnumber2;
    }

    public int minus(){
        return incomingnumber1 - incomingnumber2;
    }

    public int multiply(){
        return incomingnumber1 * incomingnumber2;
    }

    public int divide(){
        return incomingnumber1 / incomingnumber2;
    }
}

