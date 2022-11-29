package task;

/**
 * Open-closed principle - Open for extension, closed for modification
 * Now delivery providers provides drone delivery
 */
public class DeliveryTaskV2 extends DeliveryTask {
    @Override
    public void Run() throws InterruptedException {
        System.out.println("Scheduling Delivery via Drone...");
        Thread.sleep(1500);
    }
}
