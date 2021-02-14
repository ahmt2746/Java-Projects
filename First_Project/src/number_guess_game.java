import javax.swing.*;
import java.util.Random;

public class number_guess_game {

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        String sonuc = "";

        int enteredNumber = Integer.parseInt(JOptionPane.showInputDialog("Bir Sayi giriniz"));

        if (enteredNumber == randomNumber) {
            sonuc = "TEBRIKLER! Ilk denemede buldunuz :)";
            JOptionPane.showMessageDialog(null, sonuc, "Game Of Ahmet", JOptionPane.WARNING_MESSAGE);
        } else {
            int count = 1;
            while (enteredNumber != randomNumber) {
                count += 1;

                if (enteredNumber > randomNumber) {
                    enteredNumber = Integer.parseInt(JOptionPane.showInputDialog("Daha kücük bir sayi giriniz"));
                }
                if (enteredNumber < randomNumber) {
                    enteredNumber = Integer.parseInt(JOptionPane.showInputDialog("Daha büyük bir sayi giriniz"));
                }

                if (enteredNumber == randomNumber) {
                    sonuc = String.format("TEBRIKLER! %d. denemede buldunuz :) ", count);
                    JOptionPane.showMessageDialog(null, sonuc, "Game Of Ahmet", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }
}
