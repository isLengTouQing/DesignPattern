/**
 * 叶节点对象
 */
public class Leaf extends Component {
    public Leaf(String mName) {
        super(mName);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove to a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString() + mName);
    }
}
