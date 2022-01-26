package ChainOfResponsibility;

public class Designer extends AbsWorker{
    @Override
    public String execute(String command) {
        if (command.equals("спроектировать дом")){
            return "Проектировщик выполнил команду " + command;
        }
        return super.execute(command);
    }
}
