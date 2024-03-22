//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Template Method");

        StrategyTemplate strategyTemplate1 = new Strategy1();
        strategyTemplate1.masterSystemDesign();

        System.out.println("---------------------------");

        StrategyTemplate strategyTemplate2 = new Strategy2();
        strategyTemplate2.masterSystemDesign();
    }
}