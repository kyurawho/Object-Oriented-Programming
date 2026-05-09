class MySQLDatabase implements Database {
    public void save(Customer c, Cart cart, double total) {
        System.out.println("Saving order to MySQL database...");
    }
}

class MongoDBDatabase implements Database {
    public void save(Customer c, Cart cart, double total) {
        System.out.println("Saving order to MongoDB database...");
    }
}