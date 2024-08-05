/**
 * 具体观察者
 */
public class ConcrateObserver extends Observer{
    private String mName;
    private String mObserverState;
    private ConcrateSubject mSubject;

    public ConcrateObserver(ConcrateSubject subject, String mName) {
        this.mSubject = subject;
        this.mName = mName;
    }
    @Override
    public void update() {
        mObserverState = mSubject.getSubjectState();
        String format = String.format("观察者%s的新状态是%s", mName, mObserverState);
        System.out.println(format);
    }

    public ConcrateSubject getmSubject() {
        return mSubject;
    }

    public void setmSubject(ConcrateSubject mSubject) {
        this.mSubject = mSubject;
    }
}
