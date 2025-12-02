import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
    @Test
    public void testAdd(){
        
        int result = Encryption.add(2,3);
        assertEquals(6,result);
        String result1 = Encription.main(1,"Hi there you beep");
        assertEquals(result1,"Hi there you beep contains more than three words");
        String result2 = Encription.main(1,"Hello there you beep");
        assertEquals(result1,"Hello there you beep contains more than three words");
        String result3 = Encription.main(2,"Hi there you beep");
        assertEquals(result1,"Hi there you beep contains more than three words");
        String result4 = Encription.main(2,"Hello there you beep");
        assertEquals(result1,"Hello there you beep contains more than three words");
        String result5 = Encription.main(3);
        assertEquals(result1,"3 is not a valid choice");
        String result6 = Encription.main(4);
        assertEquals(result1,"4 is not a valid choice");
    }
    
}
