import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine().toLowerCase();
        String resultText = "";
        String resultNumber = "";
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int index = alphabet.indexOf(letter) + 1;
            if (index > 0) {
                resultText += letter + "  ";
                resultNumber += index + "  ";
            } else {
                resultText += letter + "  ";
                resultNumber += "  ";
            }
        }
        System.out.println(resultText);
        System.out.println(resultNumber);
    }
}