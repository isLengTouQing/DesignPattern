public class ConcrateStateB extends State {
    @Override
    public void handle(Context context) {
       context.setState(new ConcrateStateA());
    }
}
