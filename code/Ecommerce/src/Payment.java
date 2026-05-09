class CreditCardPayment implements PaymentMethod {
    public void process(Customer c, double amount) {
        System.out.println("Processing Credit Card payment for " + c.name);
        System.out.println("Charged: $" + amount);
    }
}

class PaypalPayment implements PaymentMethod {
    public void process(Customer c, double amount) {
        System.out.println("Processing PayPal payment for " + c.name);
        System.out.println("Charged: $" + amount);
    }
}

class BankTransferPayment implements PaymentMethod {
    public void process(Customer c, double amount) {
        System.out.println("Processing Bank Transfer for " + c.name);
        System.out.println("Charged: $" + amount);
    }
}