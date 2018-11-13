package pl.jg.bike_rental.webapp;

import org.junit.Test;
import pl.jg.bike_rental.domain.BikeType;

import static org.junit.Assert.*;

public class StringToBikeTypeConverterTest {

    @Test
    public void convertMTB() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        assertEquals(BikeType.MTB, converter.convert("MTB"));
    }

    @Test
    public void convertRoad() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        assertEquals(BikeType.ROAD, converter.convert("road"));
    }
    @Test
    public void convertCity() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        assertEquals(BikeType.CITY, converter.convert("City"));
    }
    @Test
    public void convertCX() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        assertEquals(BikeType.CX, converter.convert("cx"));
    }
    @Test
    public void convertTrekking() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        assertEquals(BikeType.TREKKING, converter.convert(new String ("trekKING")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertWrongInput() {
        StringToBikeTypeConverter converter = new StringToBikeTypeConverter();
        converter.convert("input");
    }
}