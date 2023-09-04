public class Order {

    private String customer;
    private Car car;
    private String situation;

    public Order(String customer, Car car) {
        this.customer = customer;
        this.car = car;
        this.situation = "Your order has been taken";
    }



    public String getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = String.valueOf(customer);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}