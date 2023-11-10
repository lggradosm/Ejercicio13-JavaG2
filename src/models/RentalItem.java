package models;

public abstract class RentalItem {
    protected String itemName;
    protected int itemID;
    protected boolean available;

    public RentalItem(String itemName, int itemID, boolean available) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.available = available;
    }

    public RentalItem() {
    }

    public abstract void showDetails();

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
