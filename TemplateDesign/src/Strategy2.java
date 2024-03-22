public class Strategy2 extends StrategyTemplate{
    @Override
    protected void choseProgrammingLanguage() {
        System.out.println("Learn GoLang");
    }

    @Override
    protected void learnObjectOrientedDesign() {
        System.out.println("Tryout Interview bit");
    }

    @Override
    protected void choseBook() {
        System.out.println("Opt for Gangs of Four");
    }

    @Override
    protected void practiceProblem() {
        System.out.println("Practice problem on Interview Ready");
    }
}
