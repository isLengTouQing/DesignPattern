/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/4/8.
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student= factory.createLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();
    }
}