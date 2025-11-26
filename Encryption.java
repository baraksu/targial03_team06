/**
 * Write a description of class Encryption here.
 *
 * @author (דניאל בכר,יאיר קוסלובסקי,רון רבי)
 * @version (a version number or a date)
 */
public class Encryption
{
    public static void main(String[] args){
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choice = reader.nextInt();
        if (choice == 1){
            System.out.println("Enter up to three words sentence");
            String sentence = reader.nextLine();
            int countWords = sentence.split("\\s").length;
            if (countWords == 1){
                //יאיר קוסלובסקי
            }
            else if (countWords == 2){
                //רון רבי
            }
            else if (countWords == 3){
                //דניאל בכר
            }
            else{
                System.out.println(sentence + "contains more than 3 words")
            }
        }
        else if (choice == 2){
            System.out.println("Enter up to three words sentence");
            String sentence = reader.nextLine();
            int countWords = sentence.split("\\s").length;
            if (countWords == 1){
                //יאיר קוסלובסקי
            }
            else if (countWords == 2){
                //רון רבי
            }
            else if (countWords == 3){
                //דניאל בכר
            }
            else{
                System.out.println(sentence + "contains more than 3 words")
            }
        }
        else
            System.out.println(choice +" is not a valid choice");
    }
}
