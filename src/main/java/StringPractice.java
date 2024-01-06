import java.util.Objects;
import java.util.SortedMap;

class Laptop{
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (getPrice() != laptop.getPrice()) return false;
        return getModel() != null ? getModel().equals(laptop.getModel()) : laptop.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + getPrice();
        return result;
    }
}
public class StringPractice {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.setPrice(1000);
        obj1.setModel("Lenovo");

        Laptop obj2 = new Laptop();
        obj2.setPrice(1000);
        obj2.setModel("Lenovo");


        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.equals(obj2));
    }
}
