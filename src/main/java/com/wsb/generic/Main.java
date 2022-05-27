package com.wsb.generic;

public class Main {
    public static void main(String[] args) {
//        Task 15
//
//        Create a class SuperNumber that has one field of any type. Add methods which print the class name of that type. Bound types to extends Numerics and create methods that:
//
//        return double value
//
//        return int value
//
//        check if double value == int value
//
//        check if int value of other SuperNumber object is the same
//
//        check if double value of other SuperNumber object is the same



        SuperNumber<Double> num = new SuperNumber<>(10.0);
        SuperNumber<Integer> num2 = new SuperNumber<>(11);

        System.out.println(num.returnDoubleValue());
        System.out.println(num.returnIntegerValue());
        num.showType();

        System.out.println("Generic Number " + num.genericNumber());
        System.out.println(num.checkValueIntSuperNumber(num2));
        System.out.println(num.checkValueDoubleSuperNumber(num2));


//        TASK 16
//
//        Create a generic class Container that implements Collection interface.
//        That class should store a list of objects of a generic type and the number of changes performed on that list.
//        Every time you change the list that number has to increase.


        Container<Double> doubleNumbers = new Container<>();
        doubleNumbers.add(10.0);
        doubleNumbers.add(11.0);
        System.out.println("Removing: ");
        doubleNumbers.printArray();
        System.out.println(doubleNumbers.getNumberOfChange());

        // TASK 17
        //Extend a Container class to ContainerWithMemory. That class should store every version of your list.
        // There should be methods that will allow you to restore a specific version, print specific version,
        // print all the history

        ContainerWithMemory<Double> containerWithMemory = new ContainerWithMemory();
        containerWithMemory.add(10.0);
        containerWithMemory.add(10.0);
        containerWithMemory.add(10.0);
        System.out.println(containerWithMemory.version.get(1));
        System.out.println(containerWithMemory.version.get(2));
        System.out.println(containerWithMemory.version.get(3));
        containerWithMemory.add(10.0);
        System.out.println(containerWithMemory.version.get(4));
        containerWithMemory.remove(10.0);
        System.out.println(containerWithMemory.version.get(5));
        containerWithMemory.restoreVersion(1);
        System.out.println(containerWithMemory.containerListMemory);




    }
}
