
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RamyGomaa
 */
public class TheatreSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double n = input.nextInt();
        final double m = input.nextInt();
        final double a = input.nextInt();
        
       
       
        System.out.println( (long)(Math.ceil(n/a)* Math.ceil(m/a)));
        
        
    }
}
