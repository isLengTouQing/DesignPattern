public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcrateCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
