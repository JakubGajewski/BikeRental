package pl.jg.bike_rental;

import org.springframework.stereotype.Repository;
import pl.jg.bike_rental.domain.Bike;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BikeDaoImplementation implements BikeDao {

    List <Bike> bikeList = new ArrayList<Bike>();

    @Override
    public void addBike(Bike bike) {
        bikeList.add(bike);
    }

    @Override
    public List<Bike> getBikes() {
        return bikeList;
    }

    @Override
    public void rentBike(Bike bike) {

    }

    @Override
    public void deleteBike(Integer id) {

    }


}
