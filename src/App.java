import order.Order;
import processor.OrderProcessor;
import task.DeliveryTask;
import task.DeliveryTaskV2;
import task.EmailTask;
import task.WorkflowTask;

import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Order order = new Order();
        order.setName("Potato");
        order.setQuantity(3);
        order.setAmount(0.45);

        /*
         Using interface as a contract provides loose coupling.
         Adheres to dependency inversion principle

         Scenario:
         - You send email to the user upon order being processed
         - Next time, you want to add on extra features like sending an SMS.
         - All you need to do is to create a new task, implement that interface and plug in your own implementation
         */
        OrderProcessor orderProcessor = new OrderProcessor(List.of(
            new EmailTask(),
            // new SMSTask(),
            new DeliveryTask(),
            // new DeliveryTaskV2(),
            new WorkflowTask()
        ));
        orderProcessor.process(order);
    }
}
