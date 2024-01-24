package singleton.connectionpool;

public class Main {
    public static void main(String[] args) {
        // Example of using the Singleton DatabaseConnectionPool
        DatabaseConnectionPool dbPoolInstance = DatabaseConnectionPool.getInstance();

        // Repeatedly get a connection from the pool and use it
        for (int i = 1; i<=15; i++) {
            Connection connection = dbPoolInstance.getConnection();

            if (connection != null) {
                // Use the connection...
                System.out.println("Using the connection " + connection.getConnectionNumber());

                // Release the connection back to the pool when done
                dbPoolInstance.releaseConnection(connection);
            }
        }
    }
}
