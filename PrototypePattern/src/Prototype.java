/**
 * 原型类
 */
public abstract class Prototype {
    private String mId;

    public Prototype() {
    }

    public Prototype(String id) {
        this.mId = id;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public abstract Prototype Clone();
}
