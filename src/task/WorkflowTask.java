package task;

public class WorkflowTask implements ITask {
    @Override
    public void Run() {
        // Process workflow
        System.out.println("Order Status: NA -> Order Status: Pending Pickup");
    }
}
