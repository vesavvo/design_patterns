package singleton.connectionpool;

public class Connection {

    private static int lastConnectionNumber = 0;
    private int connectionNumber;

    public Connection() {
        this.connectionNumber = ++lastConnectionNumber;
        System.out.println("Connection " + connectionNumber + " created.");
    }

    public int getConnectionNumber() {
        return connectionNumber;
    }
}
