package task;

public class EmailTask implements ITask {

    /**
     * Single responsibility principle just refers to doing what it is supposed to do.
     * A task should only do a task right?
     * @throws InterruptedException
     */
    @Override
    public void Run() throws InterruptedException {
        // Send Email...
        System.out.println("Sending Email..");
        Thread.sleep(2000);
    }

}
