package pl.jg.bike_rental.webapp;

import pl.jg.bike_rental.domain.BikeType;
import pl.jg.bike_rental.domain.BikeSize;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BikeForm {

    @NotEmpty
    private String model;

    @NotNull
    private BikeSize bikeSize;

    @NotNull
    private BikeType bikeType;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BikeSize getBikeSize() {
        return bikeSize;
    }

    public void setBikeSize(BikeSize bikeSize) {
        this.bikeSize = bikeSize;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }
}
