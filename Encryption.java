/**
 * Write a description of class Encryption here.
 *
 * @author (דניאל בכר,יאיר קוסלובסקי,רון רבי)
 * @version (a version number or a date)
 */
import java.util.*;
public class Encryption
{
    public static int add (int a, int b){
        
        return a+b+1;
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choice = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter up to three words sentence");
        String sentence = reader.nextLine();
        int lenBefore = sentence.length();
        String sentence2 = sentence.replace(" ","");
        int lenAfter = sentence2.length();
        int countWords = lenBefore-lenAfter+1;
        if (choice == 1){
            if (countWords == 1){
                //יאיר קוסלובסקי
            }
            else if (countWords == 2){
                //רון רבי
            }
            else if (countWords == 3){
                sentence = Encript3(sentence);
                System.out.println(sentence);
            }
            else{
                System.out.println(sentence + " contains more than 3 words");
            }
        }
        else if (choice == 2){
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
                System.out.println(sentence + "contains more than 3 words");
            }
        }
        else
            System.out.println(choice +" is not a valid choice");
    }
    public static String Encript3 (String sentence){
        String word12 = sentence.substring(0,sentence.lastIndexOf(' '));
        String word3 = sentence.substring(sentence.lastIndexOf(' ')+1);
        sentence = word3 + ' ' + word12;
        String lastThreeLetters = sentence.substring(sentence.length()-3);
        String allButLastThreeLetters = sentence.substring(0,sentence.length()-4);
        sentence = lastThreeLetters + allButLastThreeLetters;
        sentence = sentence.replace('a','@');
        sentence = sentence.replace('e','#');
        sentence = sentence.replace('i','1');
        sentence = sentence.replace('o','0');
        sentence = sentence.replace('u','&');
        return sentence;
    }
    public static String Decript3 (String sentence){
        sentence = sentence.replace('a','@');
        sentence = sentence.replace('e','#');
        sentence = sentence.replace('i','1');
        sentence = sentence.replace('o','0');
        sentence = sentence.replace('u','&');
        String word12 = sentence.substring(0,sentence.lastIndexOf(' '));
        String word3 = sentence.substring(sentence.lastIndexOf(' ')+1);
        sentence = word3 + ' ' + word12;
        String lastThreeLetters = sentence.substring(sentence.length()-3);
        String allButLastThreeLetters = sentence.substring(0,sentence.length()-4);
        sentence = lastThreeLetters + allButLastThreeLetters;

        return sentence;
    }
}
