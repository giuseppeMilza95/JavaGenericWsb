package com.wsb.generic;

public class SuperNumber<T extends Number> {

    private T number;


    public SuperNumber(T number) {
        this.number = number;
    }


    public void showType(){
        System.out.println(number.getClass().getName());
    }

    public double returnDoubleValue(){
        return number.doubleValue();
    }

    public int returnIntegerValue(){
        return number.intValue();
    }
    public boolean genericNumber(){
        if (number.doubleValue() == number.intValue()){
            return true;
        } else{
            return false;
        }

    }


    public boolean checkValueIntSuperNumber(SuperNumber<?> otherSuperNumber){
        if (number.intValue() == otherSuperNumber.number.intValue()){
            return true;
        }else{
            return false;
        }

    }

    public boolean checkValueDoubleSuperNumber(SuperNumber<?> otherSuperNumber){
        if (number.doubleValue() == otherSuperNumber.number.doubleValue()){
            return true;
        }else{
            return false;
        }

    }
}
