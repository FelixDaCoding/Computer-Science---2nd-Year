package anotherone;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter box: ");
            arr[i] = sc.nextInt();
        }

        int oo;
        try{
            System.out.println("Checking for negative numbers: ");

            for(int i = 0; i < size; i++){
                if(arr[i] < 0){
                    throw new NegativeNumberException(arr[i]);
                }
                System.out.println(arr[i]);
            }
            
        }catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }

    }


}
