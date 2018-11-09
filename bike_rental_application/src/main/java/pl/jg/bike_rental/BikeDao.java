package pl.jg.bike_rental;

import pl.jg.bike_rental.domain.Bike;

import java.util.List;

public interface BikeDao {

    public void addBike (Bike bike);

    public List<Bike> getBikes();

    public void rentBike (Bike bike);

    public void deleteBike (Integer id);

}
