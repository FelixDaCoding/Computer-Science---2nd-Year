import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter box: ");
            arr[i] = sc.nextInt();
        }

        int oo;
        try{
            System.out.println("Give me a number to reveal number of box: ");
            oo = sc.nextInt();
            System.out.println("Number inside the box is " + arr[oo]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid box index");
        }

    }


}