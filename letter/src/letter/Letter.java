/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letter;

/**
 *
 * @author Desktop
 */
public class Letter {

    /**
     * @param args the command line arguments
     */
    private final String sender;
    private final String reciever;
    private String message;

    public Letter(String from, String to) {
        sender = from;
        reciever = to;
        message = "";
    }

    public void addLine(String line) {
        message += line + "\n";
    }

    public String getText() {
        return "Dear " + reciever + ":\n\n" + message + "\nSincerely,\n\n" + sender;
    }


    
    public static void main(String[] args) {
        Letter marysLetter = new Letter("Mary", "John");
        marysLetter.addLine("I am sorry we must part.");
        marysLetter.addLine("I wish you all the best.");
        System.out.println(marysLetter.getText());
    }
    
    
}
