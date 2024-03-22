public abstract class StrategyTemplate {

    protected abstract void choseProgrammingLanguage();
    protected abstract void learnObjectOrientedDesign();

    protected abstract void choseBook();

    protected abstract void practiceProblem();

    public void masterSystemDesign(){
        this.choseProgrammingLanguage();
        this.learnObjectOrientedDesign();
        this.choseBook();
        this.practiceProblem();
    }
}
