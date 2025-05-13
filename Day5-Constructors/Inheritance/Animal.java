package Inheritance;

class Animals{
    private String name;

    public void setName(String n){
        System.out.println("Setting the animals name...");
        name = n;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animals{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public void bark(){
        System.out.println("the dog is barking!!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bruno");
        dog.setBreed("Labrador");

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        dog.bark();
    }
}
