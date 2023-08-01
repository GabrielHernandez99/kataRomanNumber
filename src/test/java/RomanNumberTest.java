import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    @Test
    public void pasar4ARomanos(){
        String numero=romanNumber.romanConverter(4);
        assertEquals(numero, "IV");
    }
    @Test
    public void pasar5ARomanos(){
        String numero=romanNumber.romanConverter(5);
        assertEquals(numero, "V");
    }
    @Test
    public void pasar6ARomanos(){
        String numero=romanNumber.romanConverter(6);
        assertEquals(numero, "VI");
    }
    @Test
    public void pasar7ARomanos(){
        String numero=romanNumber.romanConverter(7);
        assertEquals(numero, "VII");
    }
    @Test
    public void pasar8ARomanos(){
        String numero=romanNumber.romanConverter(8);
        assertEquals(numero, "VIII");
    }
    @Test
    public void pasar9ARomanos(){
        String numero=romanNumber.romanConverter(9);
        assertEquals(numero, "IX");
    }
    @Test
    public void pasar10ARomanos(){
        String numero=romanNumber.romanConverter(10);
        assertEquals(numero, "X");
    }
    @Test
    public void pasar11ARomanos(){
        String numero=romanNumber.romanConverter(11);
        assertEquals(numero, "XI");
    }
    @Test
    public void pasarVeintenaARomanos(){
        List<Integer> numeros= Arrays.asList(20,21,22,23,24,25,26,27,28,29);
        List<String> roman=numeros.stream().map(number-> romanNumber.romanConverter(number)).collect(Collectors.toList());
        assertEquals(roman.get(0), "XX");
        assertEquals(roman.get(1), "XXI");
        assertEquals(roman.get(2), "XXII");
        assertEquals(roman.get(3), "XXIII");
        assertEquals(roman.get(4), "XXIV");
        assertEquals(roman.get(5), "XXV");
        assertEquals(roman.get(6), "XXVI");
        assertEquals(roman.get(7), "XXVII");
        assertEquals(roman.get(8), "XXVIII");
        assertEquals(roman.get(9), "XXIV");

    }
}