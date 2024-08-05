/**
 * 对象声明接口
 */
public abstract class Component {
    protected String mName;

    public Component(String mName) {
        mName = mName;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
