package pl.jg.bike_rental.application;

import org.springframework.stereotype.Repository;
import pl.jg.bike_rental.domain.Rent;

@Repository
public class RentDaoImplementation implements RentDao {

    @Override
    public void addRent(Rent rent) {
        System.out.println("Adding rent to the database: " + rent);
    };

    //TODO: more operations

}
