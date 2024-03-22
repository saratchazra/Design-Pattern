public class Strategy1 extends StrategyTemplate{
    @Override
    protected void choseProgrammingLanguage() {
        System.out.println("Chose Java");
    }

    @Override
    protected void learnObjectOrientedDesign() {
        System.out.println("Learn From GFG");
    }

    @Override
    protected void choseBook() {
        System.out.println("Opt for Head First Design Pattern");
    }

    @Override
    protected void practiceProblem() {
        System.out.println("Practice Problems on GFG");
    }
}
