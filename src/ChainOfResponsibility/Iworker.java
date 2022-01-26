package ChainOfResponsibility;

public interface Iworker {
    Iworker setNextWorker(Iworker worker);
    String execute(String command);
}
