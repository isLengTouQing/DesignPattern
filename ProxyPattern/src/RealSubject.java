/**
 * Proxy所代理的真实实体
 *
 * @author by hothead
 * @date 2024/4/3.
 */
public class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("真实请求");
    }
}
