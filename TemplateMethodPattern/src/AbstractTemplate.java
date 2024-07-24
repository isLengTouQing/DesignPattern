public abstract class AbstractTemplate {

    //子类实现这些抽象行为
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod()
    {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板父类");
    }
}
