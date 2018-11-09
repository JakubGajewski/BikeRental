package pl.jg.bike_rental.webapp;

import org.springframework.core.convert.converter.Converter;
import pl.jg.bike_rental.domain.BikeType;

//@Component??
public class StringToBikeTypeConverter implements Converter<String, BikeType> {

    @Override
    public BikeType convert(String from) {
        BikeType bikeType;
        switch (from) {
            case "MTB":
                bikeType = BikeType.MTB;
                break;
            case "ROAD":
                bikeType = BikeType.ROAD;
                break;
            case "CITY":
                bikeType = BikeType.CITY;
                break;
            case "CX":
                bikeType = BikeType.CX;
                break;
            case "TREKKING":
                bikeType = BikeType.TREKKING;
                break;
            default:
                throw new IllegalArgumentException("Invalid bike type: " + from);
        }
        return bikeType;
    }
}

//Switch statement with string reference:
//https://docs.oracle.com/javase/8/docs/technotes/guides/language/strings-switch.html
//Converted tutorial:
//https://www.baeldung.com/spring-mvc-custom-data-binder