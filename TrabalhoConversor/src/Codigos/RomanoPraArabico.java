package Codigos;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class RomanoPraArabico {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Por favor, digite um número romano: ");
			String romanNumeral = scanner.nextLine().toUpperCase();
			int arabicNumeral = convertRomanToArabic(romanNumeral);
			
			if (romanNumeral != null && romanNumeral.isEmpty()){
				System.out.println("O número arábico correspondente ao valor: " + arabicNumeral);
			}else {
				System.out.println("Valor inválido. Por favor digite algum número sendo ele diferente de zero");
			}	
		}
        
    }

    public static int convertRomanToArabic(String romanNumeral) {
        Map<Character, Integer> romanToArabicMap = new HashMap<>();
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToArabicMap.get(romanNumeral.charAt(i));

            if (currentValue >= previousValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}
