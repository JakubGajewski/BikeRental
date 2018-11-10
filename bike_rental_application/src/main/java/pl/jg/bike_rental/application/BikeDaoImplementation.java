package pl.jg.bike_rental.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.jg.bike_rental.domain.Bike;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BikeDaoImplementation implements BikeDao {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    DataSource dataSource;

    @Transactional
    @Override
    public Bike getBikeById(int bikeId) {
        return entityManager.find(Bike.class, bikeId);
    }

    @Transactional
    @Override
    public void addBike(Bike bike) {
        entityManager.merge(bike);
    }

    @Transactional
    @Override
    public List<Bike> getBikes() {
        Query query = entityManager.createQuery("SELECT b FROM Bike b");
        List<Bike> bikeList = query.getResultList();
        return bikeList;
    }

    @Transactional
    @Override
    public void changeRented(int bikeId) {
        Bike bike = entityManager.find(Bike.class, bikeId);
        if (bike.getRented()) {
            bike.setRented(false);
        } else if (!bike.getRented()) {
            bike.setRented(true);
        } else {
            throw new IllegalStateException();
        }
        entityManager.merge(bike);
    }

    @Transactional
    @Override
    public void deleteBike(int bikeId) {
        Bike bike = entityManager.find(Bike.class, bikeId);
        entityManager.remove(bike);
    }
}
