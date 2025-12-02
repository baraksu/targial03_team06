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
    }@Test
    public void testAdd0(){
        String result1 = Encription.main(1,"Hi there you beep");
        assertEquals(result1,"Hi there you beep contains more than three words");
    }@Test
    public void testAdd1(){
        String result2 = Encription.main(1,"Hello there you beep");
        assertEquals(result2,"Hello there you beep contains more than three words");
    }@Test
    public void testAdd2(){
        String result3 = Encription.main(2,"Hi there you beep");
        assertEquals(result3,"Hi there you beep contains more than three words");
    }@Test
    public void testAdd3(){
        String result4 = Encription.main(2,"Hello there you beep");
        assertEquals(result4,"Hello there you beep contains more than three words");
    }@Test
    public void testAdd4(){
        String result5 = Encription.main(3);
        assertEquals(result5,"3 is not a valid choice");
    }@Test
    public void testAdd5(){
        String result6 = Encription.main(4);
        assertEquals(result6,"4 is not a valid choice");
    }
    
}
