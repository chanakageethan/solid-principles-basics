package liskov_substitution_principle;


/*
Liskov Substitution Principle (LSP)

*LSP states that objects of a derived class should be able to replace objects of the
base class without affecting the correctness of the program.

*In other words, if a class is a subclass of another class, it should be able to
substitute its parent class without causing problems.

*This principle ensures that inheritance relationships are well-designed and that the
derived class adheres to the contract of the base class.

 */


class Bird{
    public void Eat() {
        System.out.println("This bird can eat.");
    }
}



/*
Liskov Substitution Principle (LSP)   Violation Example

The Penguin class overrides the fly() method from the base class, but the behavior is fundamentally different from what’s expected by the base class. This is an LSP violation because when we try to substitute an instance of Penguin for a generic Bird, it will not behave as a typical bird in terms of flying.
 This could lead to unexpected behavior in the code.





class Bird {
    public void Eat() {
        System.out.println("This bird can eat.");
    }

    public void fly() {
        System.out.println("This bird can fly.");
    }
}
class Parrot extends Bird {
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new FlyException("Penguins cannot fly");
    }
}
 */