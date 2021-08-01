package homework.homework3;

public class Palindrome {

    public void isPalindrome(String string) {
        if (string == null || string.trim().isEmpty()) {
            System.out.println("Строка пуста");
            return;
        }

        StringBuilder stringToCompare = new StringBuilder(string).reverse();

        if (!string.equalsIgnoreCase(String.valueOf(stringToCompare))) {
            System.out.println("Строка не является палидромом");
        } else {
            System.out.println("Строка является палиндромом");
        }
    }
}

