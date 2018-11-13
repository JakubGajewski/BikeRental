package pl.jg.bike_rental.webapp;

import org.springframework.core.convert.converter.Converter;
import pl.jg.bike_rental.domain.BikeType;

public class StringToBikeTypeConverter implements Converter<String, BikeType> {

    @Override
    public BikeType convert(String from) {
        BikeType bikeType;
        switch (from.toUpperCase()) {
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