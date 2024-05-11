/**
 * 具体的装饰类B
 *
 * @author by hothead
 * @date 2024/4/2.
 */
public class ConcreateDecoratorB extends Decorator{
    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体专属");
    }
     private void addedBehavior(){

    }
}
