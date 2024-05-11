/**
 * 策略模式
 *
 * @author by hothead
 * @date 2024/4/2.
 */
public class Test {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreateStrategyA());
        context.contextInterface();
        context = new Context(new ConcreateStrategyB());
        context.contextInterface();
    }
}
