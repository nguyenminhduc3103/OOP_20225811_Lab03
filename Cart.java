public class Cart {
    private DigitalVideoDisc[] items = new DigitalVideoDisc[20]; 
    private int number_order = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (number_order < 20) {
            items[number_order] = disc;
            number_order++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("Cannot add more DVDs.");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < number_order; i++) {
            if (items[i] == disc) {
                for (int j = i; j < number_order - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[number_order - 1] = null;
                number_order--;
                System.out.println("The disc \"" + disc.getTitle() + "\" is removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < number_order; i++) {
            total += items[i].getCost();
        }
        return total;
    }
}