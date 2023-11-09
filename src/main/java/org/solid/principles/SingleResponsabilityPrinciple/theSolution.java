package org.solid.principles.SingleResponsabilityPrinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class theSolution {
    public static final int number=5;

    public static void main(String[] args) {
        List<Integer>integerList=new ArrayList<>();
        System.out.println("Go ahead");
        integerList=theSolution.InputProcess();
        Collections.sort(integerList);
        for (Integer nombre:integerList) {
            System.out.println(nombre);
        }
    }
    public static List<Integer>InputProcess(){
        Scanner scanner=new Scanner(System.in);
        List<Integer>inputNumbers=new ArrayList<>();
       String element;
        while (inputNumbers.size()!=5){
            element=scanner.nextLine();
            if (!validate(element))
                continue;
            int intElement=Integer.parseInt(element);
            inputNumbers.add(intElement);
        }
        return inputNumbers;
    }
    public static boolean validate(String input){
        try{
            int output=Integer.parseInt(input);
        }
        catch (NumberFormatException nfe){
            System.out.println("Invalid input");
            return false;
        }
        return true;
    }
    public static List<Integer>sortList(List<Integer>numbers){
        Collections.sort(numbers);
        return numbers;
    }

}
