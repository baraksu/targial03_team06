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
        String result = Encription.Encript3("Hi there you");
        assertEquals(result,"#r#y0& H1 th");
    }@Test
    public void testAdd1(){
        String result = Encription.Encript3("Hello there you");
        assertEquals(result,"#r#y0& H#ll0 th");
    }@Test
    public void testAdd2(){
        String result = Encription.Encript3("Daniel Jacob Behar");
        assertEquals(result,"c0bB#h@r D@n1#l J@");
    }@Test
    public void testAdd3(){
        String result = Encription.Encript3("Daniel my name");
        assertEquals(result," myn@m# D@n1#l");
    }@Test
    public void testAdd4(){
        String result = Encription.Encript3("My name is");
        assertEquals(result,"@m#1s My n");
    }
    
}
