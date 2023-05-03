/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int veces=1;
        for (int i = 2; i < 128; i*=2) {
            
            System.out.println("i "+i);
            veces+=1;
            System.out.println("i se ha ejecutado "+ veces+" veces");
        }
    }

    public static String incrementString(String str) {

        if (str.subSequence(str.length() - 1, str.length()).getClass().equals(String.class)) {
            return str.concat("1");
        }
        int number = 0;
        int digit = 0;
        int indexNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isDigit(str.charAt(i)))) {
                indexNum = i;
                break;
            }
        }
        for (int i = indexNum; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                digit++;
            }
        }
        number = Integer.valueOf(str.substring(indexNum));
        number++;
        int lenght = String.valueOf(number).length();
        str = str.substring(0, indexNum);
        if (lenght == String.valueOf(number).length() && lenght != 1) {
            for (int i = 0; i < (digit - 2); i++) {
                str = str.concat("0");
            }
            return str.concat(String.valueOf(number));
        } else {
            for (int i = 0; i < (digit); i++) {
                str = str.concat("0");
            }
            return str.concat(String.valueOf(number));
        }

    }

    public static int rentalCarCost(int d) {
        if (d > 6) {
            return (d * 40) - 50;
        } else if (d > 2) {
            return (d * 40) - 20;
        }
        return (d*40);
    }

}
