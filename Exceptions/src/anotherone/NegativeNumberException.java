package anotherone;

public class NegativeNumberException extends Exception{
    NegativeNumberException(int num){
        super(num + " It is a negative number breh");
    }
}
