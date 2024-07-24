/**
 * 测试入口
 */
public class Client {
    public static void main(String[] args) {

        ConcreatePrototype1 test1 = new ConcreatePrototype1("test1");
        Prototype c1 = test1.Clone();
        System.out.println("id:"+ c1.getId());


        ConcreatePrototype2 test2 = new ConcreatePrototype2("test2");
        Prototype c2 = test2.Clone();

        System.out.println("id:"+ c2.getId());
    }
}
