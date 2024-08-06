import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }
}
