package Master;

public abstract class Item {

    String description;
    double purchasePrice;
    double salePrice;

    public Item(String description, double purchasePrice, double salePrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
