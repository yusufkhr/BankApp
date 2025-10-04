public class Customer extends Person {

    private CustomerType customerType;
    private String email;

    public Customer() {}

    public Customer(CustomerType customerType, String email, String name,
                    String lastName, String address, String phone, String city) {
        super(name,lastName,address,phone,city);
        this.customerType = customerType;
        this.email = email;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    public String getEmail() {
        return email;
    }
}
