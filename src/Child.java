public class Child extends Parent{

    @Override
    public void eat(int a) {
        super.eat(a);

        System.out.println("Child.eat xxx");
    }
}
