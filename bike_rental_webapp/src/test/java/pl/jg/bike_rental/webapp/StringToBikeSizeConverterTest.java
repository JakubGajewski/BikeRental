package pl.jg.bike_rental.webapp;

import org.junit.Before;
import org.junit.Test;
import pl.jg.bike_rental.domain.BikeSize;

import static org.junit.Assert.*;

public class StringToBikeSizeConverterTest {

    StringToBikeSizeConverter converter;

    @Before
    public void before () {
        this.converter = new StringToBikeSizeConverter();
    }

    @Test
    public void convertXS() {
        assertEquals(BikeSize.XS, converter.convert("XS"));
    }

    @Test
    public void convertS() {
        assertEquals(BikeSize.S, converter.convert("S"));
    }

    @Test
    public void convertM() {
        assertEquals(BikeSize.M, converter.convert("m"));
    }

    @Test
    public void convertL() {
        assertEquals(BikeSize.L, converter.convert("l"));
    }

    @Test
    public void convertXL() {
        assertEquals(BikeSize.XL, converter.convert("xl"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongInputXXS() {
        converter.convert("XXS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongInputXXL() {
        converter.convert("XXL");
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyInput() {
        converter.convert("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongInput() {
        converter.convert("ABC");
    }
}