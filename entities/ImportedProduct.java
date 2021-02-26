package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return (this.getName() + " $ " + this.getPrice() + " (Customs fee: $ " + this.customsFee + ")");
    }


    
}
