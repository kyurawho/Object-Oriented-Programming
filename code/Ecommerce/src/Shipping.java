class JNEShipping implements Shipping {
    public void ship(Customer c) { 
    	System.out.println("Shipping via JNE to " + c.address); 
    }
}
class JNTShipping implements Shipping {
    public void ship(Customer c) { 
    	System.out.println("Shipping via J&T to " + c.address); 
    }
}
class SiCepatShipping implements Shipping {
    public void ship(Customer c) { 
    	System.out.println("Shipping via SiCepat to " + c.address); 
    }
}