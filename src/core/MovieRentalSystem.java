package core;

import models.Customer;
import models.Movie;
import models.RentalItem;

import java.util.ArrayList;
import java.util.List;

public class MovieRentalSystem {
    private List<RentalItem> rentalItems;
    private List<Customer> customers;

    public MovieRentalSystem() {
        this.rentalItems = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addItem(RentalItem rentalItem){
        this.rentalItems.add(rentalItem);
    }

    public void registerCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void returnMovie (int id) {
        RentalItem rentalItem = (RentalItem) this.rentalItems.stream().filter(item -> item.getItemID() == id);
        rentalItem.setAvailable(true);
    }
    public void rentMovieToCustomer(int customerId, int movieId){
        Customer customer = new Customer();
        RentalItem rentalItem = new Movie();
        for (Customer c: customers){
            if(c.getCustomerID() == customerId){
                customer = c;
                break;
            }
        }

        for (RentalItem item: rentalItems){
            if(item.getItemID() == movieId){
                rentalItem = item;
                break;
            }
        }
        rentalItem.setAvailable(false);
        customer.rentMovie(rentalItem);
    }

    public Customer getCustomer(int customerId){
        for (Customer customer: customers){
            if(customer.getCustomerID() == customerId) return customer;
        }
        return null;
    }

    public void showAllItems(){
        System.out.println("-----------PELICULAS REGISTRADAS------------");
        for(RentalItem rentalItem: rentalItems){
            System.out.println(rentalItem.toString());
        }
    }

    public void showAllCustomers(){
        System.out.println("-----------CLIENTES REGISTRADOS------------");
        for(Customer customer: customers){
            System.out.println(customer.toString());
        }
    }


}
