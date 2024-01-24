package singleton.timer;

public class Timer {
    private static Timer instance;
    private long startTime;
    private Timer() {
        reset();
    }

    public static synchronized Timer getInstance() {
        if (instance == null) {
            instance = new Timer();
        }
        return instance;
    }

    public synchronized void reset() {
        startTime = System.currentTimeMillis();
    }
    public synchronized int getTime() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;
        return (int) (elapsedTime / 1000);
    }
}
