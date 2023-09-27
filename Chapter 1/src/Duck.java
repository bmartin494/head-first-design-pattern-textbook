public abstract class Duck {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.print("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(IFlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(IQuackBehaviour qb){
        quackBehaviour = qb;
    }
}
