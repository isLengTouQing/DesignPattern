/**
 * 具体主题/具体通知者
 */
public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
