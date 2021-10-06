public class African extends Person{
    private String country;

    public African(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    @Override
    public void eat() {
        System.out.println("I am eating fufu");
    }

    public void eat(String food){
        System.out.println("my favorite food is " + food);
    }
}
