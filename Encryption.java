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
    // דניאל בכר
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
                sentence = Encript2(sentence);
            }
            else if (countWords == 3){
                // דניאל בכר
                sentence = Encript3(sentence);
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
               sentence =  Decrypt2(sentence); 
                //רון רבי
            }
            else if (countWords == 3){
            // דניאל בכר
            sentence = Decript3(sentence);
            }
            else{
                System.out.println(sentence + "contains more than 3 words");
            }
        }
        else
            System.out.println(choice +" is not a valid choice");
    }
    // דניאל בכר
    public static String Encript3 (String sentence){
        String word12 = sentence.substring(0,sentence.lastIndexOf(' '));
        String word3 = sentence.substring(sentence.lastIndexOf(' ')+1);
        sentence = word3 + ' ' + word12;
        String lastThreeLetters = sentence.substring(sentence.length()-3);
        String allButLastThreeLetters = sentence.substring(0,sentence.length()-3);
        sentence = lastThreeLetters + allButLastThreeLetters;
        sentence = sentence.replace('a','@');
        sentence = sentence.replace('e','#');
        sentence = sentence.replace('i','1');
        sentence = sentence.replace('o','0');
        sentence = sentence.replace('u','&');
        System.out.println(sentence);
        return sentence;
    }
    // דניאל בכר
    public static String Decript3 (String sentence){
        sentence = sentence.replace('@','a');
        sentence = sentence.replace('#','e');
        sentence = sentence.replace('1','i');
        sentence = sentence.replace('0','o');
        sentence = sentence.replace('&','u');
        String firstThreeLetters = sentence.substring(0,3);
        String allButFirstThreeLetters = sentence.substring(3);
        sentence = allButFirstThreeLetters + firstThreeLetters;
        String word1 = sentence.substring(0,sentence.indexOf(' '));
        String word23 = sentence.substring(sentence.indexOf(' ')+1);
        sentence = word23 + ' ' + word1;
        System.out.println(sentence);
        return sentence;
    }
      public static String Encript2 (String sentence){
    int replaceWords = sentence.indexOf(" ");
    String first = sentence.substring(0, replaceWords);
    String second = sentence.substring(replaceWords + 1);
    sentence = second + " " + first;
    int len = sentence.length();
    String moveW = sentence.substring(len - 2);
    String dontM = sentence.substring(0, len - 2);
    sentence = moveW + dontM;
    sentence = sentence.replace('e', '#');
    sentence = sentence.replace('a', '@');
    sentence = sentence.replace('u', '&');
    sentence = sentence.replace('o', '0');
    sentence = sentence.replace('i', '1');
    System.out.println("The encrypt sentence is:" + sentence);
    return sentence;
    }
    public static String Decrypt2(String sentence){
          sentence = sentence.replace('#', 'e');
    sentence = sentence.replace('@', 'a');
    sentence = sentence.replace('&', 'u');
    sentence = sentence.replace('0', 'o');
    sentence = sentence.replace('1', 'i');
    int len = sentence.length();
    String splitW1 = sentence.substring(2);
    String splitW2 = sentence.substring(0, 2);
    sentence = splitW1 +splitW2;
  
    int repWords = sentence.indexOf(" ");
    String firstW = sentence.substring(0, repWords);
    String secondW = sentence.substring(repWords + 1);
    sentence = secondW +" "+ firstW;

  
         System.out.println("The dycript sentence is:" + sentence);
    return sentence;
    }
}
