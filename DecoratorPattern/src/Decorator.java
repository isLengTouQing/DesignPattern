/**
 * 装饰抽象类，继承了Component,通过外来类来扩展Component类的功能
 * 但对于Component来说是不需要知道Decorator的存在
 *
 * @author by hothead
 * @date 2024/4/2.
 */
public abstract class Decorator extends Component{
    protected Component component;
    public void setComponent(Component component) {
        this.component = component;
    }
    @Override
    public void Operation() {
        if(component == null){
            component.Operation();
        }
    }
}
