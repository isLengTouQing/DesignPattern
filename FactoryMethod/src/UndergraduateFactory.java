/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/4/8.
 */
public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}
