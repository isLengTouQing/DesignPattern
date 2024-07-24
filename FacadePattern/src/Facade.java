public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void MethodA(){
        subSystemOne.MehtodOne();
        subSystemTwo.MehtodOne();
    }

    public void MethodB(){
        subSystemOne.MehtodOne();
        subSystemThree.MehtodOne();
    }
}
