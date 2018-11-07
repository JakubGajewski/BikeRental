package pl.jg.bike_rental.domain;

import java.util.Objects;

public class Bike {
    private Integer id;
    private String model;
    private Size size;
    private BikeType bikeType;

    public void dupa () {
        if (this.size.equals(Size.L)) {
            System.out.println("dupa");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public Bike(Integer id, String model, Size size, BikeType bikeType) {
        this.id = id;
        this.model = model;
        this.size = size;
        this.bikeType = bikeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id) &&
                Objects.equals(model, bike.model) &&
                size == bike.size &&
                bikeType == bike.bikeType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model, size, bikeType);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", bikeType=" + bikeType +
                '}';
    }
}
