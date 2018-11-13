package pl.jg.bike_rental.webapp;

import org.springframework.core.convert.converter.Converter;
import pl.jg.bike_rental.domain.BikeSize;
import pl.jg.bike_rental.domain.BikeSize;

public class StringToBikeSizeConverter implements Converter<String, BikeSize> {

    @Override
    public BikeSize convert(String from) {
        BikeSize bikeSize;
        switch (from.toUpperCase()) {
            case "XS":
                bikeSize = BikeSize.XS;
                break;
            case "S":
                bikeSize = BikeSize.S;
                break;
            case "M":
                bikeSize = BikeSize.M;
                break;
            case "L":
                bikeSize = BikeSize.L;
                break;
            case "XL":
                bikeSize = BikeSize.XL;
                break;
            default:
                throw new IllegalArgumentException("Invalid bike size: " + from);
        }
        return bikeSize;
    }
}