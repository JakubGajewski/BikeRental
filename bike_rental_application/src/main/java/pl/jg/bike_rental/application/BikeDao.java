package pl.jg.bike_rental.application;

import pl.jg.bike_rental.domain.Bike;

import java.util.List;

public interface BikeDao {

    public void addBike (Bike bike);

    public Bike getBikeById(int bikeId);

    public List<Bike> getBikes();

    public void changeRented (int bikeId);

    public void deleteBike (int bikeId);

}
