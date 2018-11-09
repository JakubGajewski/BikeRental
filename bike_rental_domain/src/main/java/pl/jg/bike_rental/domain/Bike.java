package pl.jg.bike_rental.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Bike {

    @Id
    private Integer id;

    private String model;

    @Column(name="bike_size")
    private BikeSize bikeSize;

    @Column(name="bike_type")
    private BikeType bikeType;

    private Boolean rented;

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

    public Boolean isRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public Bike() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id) &&
                Objects.equals(model, bike.model) &&
                bikeSize == bike.bikeSize &&
                bikeType == bike.bikeType &&
                Objects.equals(rented, bike.rented);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model, bikeSize, bikeType, rented);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", bikeSize=" + bikeSize +
                ", bikeType=" + bikeType +
                ", rented=" + rented +
                '}';
    }
}
