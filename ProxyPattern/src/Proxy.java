/**
 * 代理类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样就可以用代理来代替实体。
 *
 * @author by hothead
 * @date 2024/4/3.
 */
public class Proxy extends Subject {
    private RealSubject mRealSubject;
    
    private YellowSubject yellowSubject;

    @Override
    public void request() {
        if (mRealSubject == null) {
            mRealSubject = new RealSubject();
        } else if (yellowSubject == null) {
            yellowSubject = new YellowSubject();
        }
        mRealSubject.request();
        yellowSubject.request();
    }
}
