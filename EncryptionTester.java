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
        String result = Encryption.Encript3("Hi there you");
        assertEquals(result,"#r#y0& H1 th");
    }@Test
    public void testAdd1(){
        String result = Encryption.Encript3("Hello there you");
        assertEquals(result,"#r#y0& H#ll0 th");
    }@Test
    public void testAdd2(){
        String result = Encryption.Encript3("Daniel Jacob Behar");
        assertEquals(result,"c0bB#h@r D@n1#l J@");
    }@Test
    public void testAdd3(){
        String result = Encryption.Encript3("Daniel my name");
        assertEquals(result," myn@m# D@n1#l");
    }@Test
    public void testAdd4(){
        String result = Encryption.Encript3("My name is");
        assertEquals(result,"@m#1s My n");
    }
    @Test
    public void testAdd5(){
        String result = Encryption.Decript3("@m#1s My n");
        assertEquals(result,"My name is");
    }
    @Test
    public void testAdd6(){
        String result = Encryption.Decript3(" myn@m# D@n1#l");
        assertEquals(result,"Daniel my name");
    }
    @Test
    public void testAdd7(){
        String result = Encryption.Decript3("#r#y0& H#ll0 th");
        assertEquals(result,"Hello there you");
    }
    @Test
    public void testAdd8(){
        String result = Encryption.Decript3("#r#y0& H1 th");
        assertEquals(result,"Hi there you");
    }
    @Test
     public void testAdd9(){
        String result = Encryption.Decript3("c0bB#h@r D@n1#l J@");
        assertEquals(result,"Daniel Jacob Behar");
    }
    
}
