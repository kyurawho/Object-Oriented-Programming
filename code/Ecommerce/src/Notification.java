class EmailNotification implements Notification {
    public void send(Customer c) { 
    	System.out.println("Sending email to " + c.email); 
    }
}
class SMSNotification implements Notification {
    public void send(Customer c) { 
    	System.out.println("Sending SMS to " + c.phone); 
    }
}
class WhatsAppNotification implements Notification {
    public void send(Customer c) { 
    	System.out.println("Sending WhatsApp to " + c.phone); 
    }
}