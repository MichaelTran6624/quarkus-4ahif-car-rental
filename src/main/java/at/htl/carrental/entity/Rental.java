
package at.htl.carrental.entity;

import java.time.LocalDateTime;

public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDateTime startDateTime;
    LocalDateTime endDateTime;
    private double discount;

    //region constructor
    public Rental() {
    }

    public Rental(Customer customer, Vehicle vehicle, LocalDateTime startDateTime, LocalDateTime endDateTime, double discount) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
    }
    //endregion

    //region getter setter
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    //endregion


    @Override
    public String toString() {
        return "Rental{" +
                "customer=" + customer +
                ", vehicle=" + vehicle +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", discount=" + discount +
                '}';
    }
}