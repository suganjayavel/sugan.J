package javarecall;

public class electricityBill {

    public static void main(String[] args) {
        int units = 200;
        double bill = 0.0;

        if (units <= 50) {
            bill = 0.0;
            
        } else if (units <= 100) {
            bill = (units - 50) * 0.50;
            
        } else if (units <= 250) {
            bill = 50 * 0.50 + (units - 100) * 1.0;
            
        } else {
            bill = 50 * 0.50 + 150 * 1.0 + (units - 250) * 1.50;
        }

        // Adding 20% tax on the overall bill value
        double tax = bill * 0.20;
        double totalBill = bill + tax;

        System.out.println("Units consumed: " + units);
        System.out.println("Electricity bill (excluding tax): RS " + bill);
        System.out.println("Tax (20%): RS " + tax);
        System.out.println("Total electricity bill (including tax): RS " + totalBill);
    }
}
