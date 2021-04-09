package ATECHMODUL.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C11_Math_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());
        Math_Operation(a,p,b);

    }public static Double Math_Operation(double a, String p,double b){
        double sum = 0;
        if(p.equals("+")){
            sum = a + b;
        }if(p.equals("-")){
            sum = a - b;
        }if(p.equals("*")){
            sum = a * b;
        }if(p.equals("/")){
            sum = a / b;
        }
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(sum));
        return sum;
    }
}
