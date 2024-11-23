import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<DigitalVideoDisc> items = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.size() < 20) {
            if (!items.contains(disc)) {
                items.add(disc);
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            } else {
                System.out.println("The disc \"" + disc.getTitle() + "\" is already in the cart.");
            }
        } else {
            System.out.println("Cannot add more DVDs.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (items.size() < 20) {
                addDigitalVideoDisc(disc); 
            } else {
                System.out.println("Cannot add \"" + disc.getTitle() + "\". The cart is full.");
                break; 
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvds1, DigitalVideoDisc dvds2) {
            addDigitalVideoDisc(dvds1); 
            addDigitalVideoDisc(dvds2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            System.out.println("The disc \"" + disc.getTitle() + "\" is removed.");
        } else {
            System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
        }
    }

    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }

    public void displayCartContents() {
        System.out.println("Cart Contents:");
        for (DigitalVideoDisc disc : items) {
            System.out.println("- " + disc.getTitle() + ": $" + disc.getCost());
        }
        System.out.println("Total cost: $" + totalCost());
    }
}
