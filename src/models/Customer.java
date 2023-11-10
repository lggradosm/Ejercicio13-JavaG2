package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private int customerID;
    private List<RentalItem> rentedMovies;

    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.rentedMovies = new ArrayList<>();
    }

    public Customer() {

    }

    public void showCustomerDetails(){
        System.out.println("--------- "+this.customerName+" DETALLE --------------");
        System.out.println("ID: "+this.customerID);
        System.out.println("-----------PELICULAS RENTADAS---------");
        for (RentalItem movie: rentedMovies){
            System.out.println(movie.toString());
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public List<RentalItem> getRentedMovies() {
        return rentedMovies;
    }

    public void setRentedMovies(List<RentalItem> rentedMovies) {
        this.rentedMovies = rentedMovies;
    }

    public void rentMovie(RentalItem movie){
        this.rentedMovies.add(movie);
    }

    @Override
    public String toString(){
        return "ID: "+this.customerID+"\nNombre: "+customerName;
    }
}
