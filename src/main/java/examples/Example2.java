package examples;

public class Example2 {

    private void emptySynchronized() {
        synchronized (this) {
            Thread.sleep(3000);
        }
    }

    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(5000);
        }
    }
}
