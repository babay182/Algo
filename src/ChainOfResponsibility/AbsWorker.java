package ChainOfResponsibility;

public abstract class AbsWorker implements Iworker{
    public Iworker nextWorker;

    public AbsWorker() {
        nextWorker = null;
    }

    @Override
    public Iworker setNextWorker(Iworker worker) {
        nextWorker = worker;
        return worker;
    }

    @Override
    public String execute(String command) {
        if (nextWorker != null){
            return nextWorker.execute(command);
        }
        return "никто не умеет";
    }
}
