package project1;

public class Invoice implements Payable {
    private int quantity;
    private Double pricePerItem;

    public Invoice(String partNumber, int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
