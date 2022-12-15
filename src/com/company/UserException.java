package com.company;

import java.util.Scanner;

public class UserException {
    public static void main(String[] args) throws FromOneToNineException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 9");
        int a= scanner.nextInt();
     // validateNumber(a);
EvenNumber(a);
    }

    static void EvenNumber(int a) throws FromOneToNineException {
        if(a%2!=0) throw new FromOneToNineException("not even");
    }
    static void validateNumber(int a) throws FromOneToNineException {
        if(a<1 || a>9) throw new FromOneToNineException("not even");
    }

}
class FromOneToNineException extends Exception{
    public FromOneToNineException(String message) {
        super(message);
    }

}

