package pl.jg.bike_rental;

import org.springframework.stereotype.Repository;
import pl.jg.bike_rental.domain.Bike;
import pl.jg.bike_rental.domain.BikeType;
import pl.jg.bike_rental.domain.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BikeDaoImplementation implements BikeDao {

    List <Bike> bikeList = Arrays.asList(
            new Bike(1, "Trek Roscoe", Size.L, BikeType.MTB),
            new Bike(2, "Romet Rambler", Size.M, BikeType.MTB),
            new Bike(3, "Giant Toughroad", Size.XL, BikeType.TREKKING)
    );

    public void addBike(Bike bike) {
        bikeList.add(bike);
    }

    public List<Bike> getBikes() {
        return bikeList;
    }
}
