package task;

@FunctionalInterface
public interface ITask {
    /**
     * Implements a contract for interface segregation principle.
     * Should only expose required methods
     * @throws InterruptedException This is an example
     */
    void Run() throws InterruptedException;
}
