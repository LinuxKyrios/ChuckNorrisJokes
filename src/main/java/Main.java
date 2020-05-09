import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ChuckNorrisQuotes random = new ChuckNorrisQuotes();

        //For showing joke in message box
        JOptionPane.showMessageDialog(null, random.getRandomQuote());
    }
}