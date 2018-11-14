package pl.jg.bike_rental.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="rent")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate from;
    private LocalDate to;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Rent() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id == rent.id &&
                Objects.equals(from, rent.from) &&
                Objects.equals(to, rent.to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, from, to);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
