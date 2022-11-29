package processor;

import order.Order;
import task.ITask;

import java.util.List;

public class OrderProcessor {
    private final List<ITask> tasks;

    public OrderProcessor(List<ITask> tasks) {
        this.tasks = tasks;
    }

    public void process(Order order) throws InterruptedException {
        // Make Payment
        System.out.println("Making Payment...");
        Thread.sleep(3000);
        System.out.println("Payment Completed!");

        // Processing Order
        System.out.println("Processing Order...");
        Thread.sleep(3000);
        System.out.println(order);
        System.out.println("Processed Order!");

        // Execute tasks
        for (ITask task : tasks) {
            task.Run();
        }
    }
}
