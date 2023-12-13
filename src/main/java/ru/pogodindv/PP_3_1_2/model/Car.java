package ru.pogodindv.PP_3_1_2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
    private User user;
    public Car(long id, String model, int series) {

        this.id = id;
        this.model = model;
        this.series = series;
    }
    public Car() {}

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +

                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User setUser(User user) {
        this.user = user;
        return user;
    }
}
