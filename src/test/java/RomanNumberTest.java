import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
    private RomanNumber romanNumber;

    @BeforeEach
    void setUp() {
        romanNumber=new RomanNumber();
    }
    @Test
    public void pasar1ARomanos(){
        String numero=romanNumber.romanConverter(1);
        assertEquals(numero, "I");
    }
    @Test
    public void pasar2ARomanos(){
        String numero=romanNumber.romanConverter(2);
        assertEquals(numero, "II");
    }
    @Test
    public void pasar3ARomanos(){
        String numero=romanNumber.romanConverter(3);
        assertEquals(numero, "III");
    }
}