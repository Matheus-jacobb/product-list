package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        return (this.getName() + "(used)" +" $ " + this.getPrice() + " (Manufacture date: " + data.format(this.manufactureDate) + ")");
    }

    

}