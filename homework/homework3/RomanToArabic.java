package homework.homework3;

public class RomanToArabic {

    public int convertRomanToArabic(String romanNumber) {
        if (romanNumber == null || romanNumber.trim().isEmpty()) {
            return 0;
        }

        char[] romanArray = romanNumber.toUpperCase().toCharArray();
        int result = convertSymbolToInt(romanArray[romanArray.length - 1]);

        for (int i = romanArray.length - 1; i > 0; i--) {
            int previousSymbol = convertSymbolToInt(romanArray[i - 1]);
            int symbol = convertSymbolToInt(romanArray[i]);

            if (previousSymbol < symbol) {
                result -= previousSymbol;
            } else {
                result += previousSymbol;
            }
        }
        return result;
    }

    private int convertSymbolToInt(char symbol) {
        int arabicNumber = 0;
        switch (symbol) {
            case 'M':
                arabicNumber = 1000;
                break;
            case 'D':
                arabicNumber = 500;
                break;
            case 'C':
                arabicNumber = 100;
                break;
            case 'L':
                arabicNumber = 50;
                break;
            case 'X':
                arabicNumber = 10;
                break;
            case 'V':
                arabicNumber = 5;
                break;
            case 'I':
                arabicNumber = 1;
                break;
        }
        return arabicNumber;
    }
}