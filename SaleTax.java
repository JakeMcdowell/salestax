import java.util.Scanner;

/**
 * Jake McDdowell
 */

public class SaleTax {
//        static String iPurcPrice;
        static double  iPurcPrice, cStaTax, cCountax, cTotSaleTax, cTotal;
        static Scanner inputKeyboard;

        public static void main(String[] args) {
                init();
                input();
                calcs();
                output();
        }

        public static void output() {
                System.out.println("Purchase Price: " + iPurcPrice);
                System.out.println("State Tax: " + cStaTax);
                System.out.println("County Tax: " + cCountax);
                System.out.println("Total Sales Tax: " + cTotSaleTax);
                System.out.println("Total Sale: " + cTotal);


        }

        public static void calcs(){
                cStaTax = iPurcPrice * .04;
                cCountax = iPurcPrice * .02;
                cTotSaleTax = cStaTax + cCountax;
                cTotal = cTotSaleTax + iPurcPrice;


        }
        public static void input(){
                System.out.println("Enter purchase Price: ");
                iPurcPrice = Double.parseDouble(inputKeyboard.nextLine());

        }

        public static void init(){
                inputKeyboard = new Scanner(System.in);
        }
}