public class Invoker {
    private Command mCommand;

    public void setCommand(Command command)
    {
        mCommand = command;
    }

    public void executeCommand()
    {
        mCommand.execute();
    }
}
