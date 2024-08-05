/**
 * 具体状态类，每个子类实现一个与Context的一个状态相关的行为
 */
public class ConcrateStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcrateStateB());
    }
}
