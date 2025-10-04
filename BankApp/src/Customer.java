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
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void Info(){
        System.out.println("Name: " + getName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("City: " + getCity());
        System.out.println("Phone Number: " + getPhone());
        System.out.println("Email: " + email);
        System.out.println("CustomerType: " + customerType.toString());
    }

}
