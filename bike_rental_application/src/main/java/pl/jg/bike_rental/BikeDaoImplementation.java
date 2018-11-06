package pl.jg.bike_rental;

import pl.jg.bike_rental.domain.Bike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BikeDaoImplementation implements BikeDao {

    List <Bike> bikeList = Arrays.asList(new Bike(), new Bike(), new Bike());

    public void addBike(Bike bike) {
        bikeList.add(bike);
    }

    public List<Bike> getBikes() {
        return bikeList;
    }
}
