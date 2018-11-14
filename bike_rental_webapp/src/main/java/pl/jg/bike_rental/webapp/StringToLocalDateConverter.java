package pl.jg.bike_rental.webapp;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse("2018.12.06", formatter);
    }
}