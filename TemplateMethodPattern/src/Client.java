/**
 * 测试入口
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = null;
        abstractTemplate = new ConcreateClassA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreateClassB();
        abstractTemplate.templateMethod();
    }
}
