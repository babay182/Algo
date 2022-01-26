package ChainOfResponsibility;

public class FinishWorker extends AbsWorker{
    @Override
    public String execute(String command) {
        if(command.equals("клеить обои")){
            return "Рабочий внутренней отделки выполнил команду " + command;
        }
        return super.execute(command);
    }
}
