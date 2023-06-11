package Codigos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ArabicoPraRomano{

    private static final Map<Integer, String> arabicToRomanMap = new LinkedHashMap<>();

    static {
        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Por favor, digite um número arábico: ");
			int arabicNumeral = scanner.nextInt();
			String romanNumeral = convertArabicToRoman(arabicNumeral);
			
			if (arabicNumeral != 0)  {
				System.out.println("O número romano correspondente ao valor: " + romanNumeral);
			}else {				
				System.out.println("Insira um número, ele deve ser diferente de zero! Fim de Execução");
			}

		}
        
        
    }

    public static String convertArabicToRoman(int arabicNumeral) {
        StringBuilder romanNumeral = new StringBuilder();

        for (Map.Entry<Integer, String> entry : arabicToRomanMap.entrySet()) {
            int arabicValue = entry.getKey();
            String romanValue = entry.getValue();

            while (arabicNumeral >= arabicValue) {
                romanNumeral.append(romanValue);
                arabicNumeral -= arabicValue;
            }
        }

        return romanNumeral.toString();
    }
}