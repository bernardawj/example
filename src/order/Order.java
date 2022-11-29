package order;

public class Order {
    private Double amount;
    private String name;
    private Integer quantity;

    public Order() {
    }

    public Order(Double amount, String name, Integer quantity) {
        this.amount = amount;
        this.name = name;
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                   "amount=" + amount +
                   ", name='" + name + '\'' +
                   ", quantity=" + quantity +
                   '}';
    }
}
