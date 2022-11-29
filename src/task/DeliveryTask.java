package task;

public class DeliveryTask implements ITask {
    @Override
    public void Run() throws InterruptedException {
        // Schedule Delivery
        System.out.println("Scheduling Delivery via Van...");
        Thread.sleep(1500);
    }
}
