import core.MovieRentalSystem;
import models.Customer;
import models.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        MovieRentalSystem system = new MovieRentalSystem();
        iniciarSistema(system);

        Scanner sc = new Scanner(System.in);
        int seleccion;
        int movieId;
        int customerId;
        System.out.println("-----SISTEMA DE RENTA DE PELICULAS-----");
        while (!exit){
            System.out.println("---------------------------------------");
            System.out.println("1. Ver todas las películas");
            System.out.println("2. Rentar Película");
            System.out.println("3. Devolver Película");
            System.out.println("4. Ver todos los clientes");
            System.out.println("5. Buscar Cliente");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción la opción");
            seleccion = sc.nextInt();
            switch (seleccion){
                case 1:
                    system.showAllItems();
                    break;
                case 2:
                    System.out.println("Ingrese el ID del cliente:");
                    customerId = sc.nextInt();
                    System.out.println("Ingrese el ID de la película a rentar:");
                    movieId = sc.nextInt();
                    system.rentMovieToCustomer(customerId,movieId);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la película a rentar:");
                    movieId = sc.nextInt();
                    system.returnMovie(movieId);
                    break;
                case 4:
                    system.showAllCustomers();
                    break;
                case 5:
                    System.out.println("Ingrese el ID del cliente:");
                    customerId = sc.nextInt();
                    system.getCustomer(customerId).showCustomerDetails();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }



    }

    static void iniciarSistema(MovieRentalSystem system){
        Movie shrek = new Movie("Srehk",1,true,"Andrew Adamson y Vicky Jenson",90,"Todas las edades","Animación - Aventura - Comedia - Sátira");
        Movie titanic = new Movie("Titanic",2,true,"James Cameron",194,"+13", "Romance - Drama");
        Movie theAvengers = new Movie("Los Vengadores",3,true,"Joe Russo, Anthony Russo y Joss Whedon", 143, "+15", "Ciencia Ficción - Acción");
        Movie up = new Movie("Up",4,true,"Pete Docter",96,"Todas las edades","Animación - Comedia");
        system.addItem(shrek);
        system.addItem(titanic);
        system.addItem(theAvengers);
        system.addItem(up);

        Customer gabriel = new Customer("Gabriel",1);
        Customer cesar = new Customer("Cesar",2);
        Customer angel = new Customer("Angel",3);
        system.registerCustomer(gabriel);
        system.registerCustomer(cesar);
        system.registerCustomer(angel);
    }
}