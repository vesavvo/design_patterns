package singleton.connectionpool;

import java.util.ArrayList;
import java.util.List;

class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private List<Connection> connectionPool;

    private DatabaseConnectionPool() {
        // Initialize the connection pool with up to 10 database connections
        connectionPool = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            connectionPool.add(createDatabaseConnection());
        }
        System.out.println("Database connection pool created.");
    }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        if (!connectionPool.isEmpty()) {
            return connectionPool.remove(0);
        } else {
            System.out.println("No available connections in the pool.");
            return null;
        }
    }

    public synchronized void releaseConnection(Connection connection) {
        // Perform any necessary cleanup before returning the connection to the pool
        connectionPool.add(connection);
        System.out.println("Connection " + connection.getConnectionNumber() + " released.");
    }

    private synchronized Connection createDatabaseConnection() {
        // Simulate the process of creating a database connection
        return new Connection();
    }
}


