package liskov_substitution_principle;

class Parrot extends FlyingBird {
    @Override
    public void Eat() {
        super.Eat();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
