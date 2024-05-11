/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/4/2.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        Decorator decoratorA = new ConcreateDecoratorA();
        Decorator decoratorB = new ConcreateDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(component);
        decoratorB.Operation();
    }
}
