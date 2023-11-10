package models;

public class Movie extends RentalItem {
    private String director;
    private int duration;
    private String ageRating;
    private String genre;

    public Movie(String itemName, int itemID, boolean available, String director, int duration, String ageRating, String genre) {
        super(itemName, itemID, available);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
        this.genre = genre;
    }

    public Movie() {
    }

    @Override
    public void showDetails() {
        System.out.println("-------------DETALLE PELICULA-----------");
        System.out.println(this.toString());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "ID: "+this.itemID+"\nNombre: "+this.itemName+"\nDirector: "+this.director+"\nDuración: "+this.duration
                +"\nRestricción: "+this.ageRating+"\nGénero: "+this.genre+"\nEstado: "+(this.available?"Disponible":"No Disponible");
    }
}
