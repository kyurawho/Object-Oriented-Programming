interface PaymentMethod {
    void process(Customer customer, double amount);
}

interface Shipping {
    void ship(Customer customer);
}

interface Notification {
    void send(Customer customer);
}

interface Database {
    void save(Customer customer, Cart cart, double total);
}