/**
 * Context类，维护一个ConcrateState子类的实例，这个实例定义为当前的状态
 */
public class Context {
    private State mState;

    public State getmState() {
        return mState;
    }

    public void setState(State mState) {
        this.mState = mState;
        System.out.println("当前状态" + mState.getClass().getName());
    }

    public Context(State mState) {
        this.mState = mState;
    }

    public void request(){
        mState.handle(this);
    }
}
