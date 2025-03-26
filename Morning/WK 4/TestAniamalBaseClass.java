public class TestAniamalBaseClass
{
    public static void main(String[] args)
    {
        AniamalBaseClass animal = new AniamalBaseClass("Turks", 2);
        String name = animal.getAnimalName();
        int age = animal.getAnimalAge();
        System.out.printf("%s, is %d year[s] old\n", name, age);
        animal.makeSound();        
        System.out.println("--------------------------------\n");


        Cat myCat = new Cat("Tom the Cat", 2, "Black");

        name = myCat.getAnimalName();
        age = myCat.getAnimalAge();
        String color = myCat.getCatColour();

        System.out.printf("%s, is %d year[s] old and is %s in colour\n", name, age, color);
        myCat.makeSound();
        System.out.println("--------------------------------\n");




        Dog myDog = new Dog("Steeve the Dog", 3, "Golden Retriever");

        name = myDog.getAnimalName();
        age = myDog.getAnimalAge();
        String breed = myDog.getDogBreed();

        System.out.printf("%s, is %d year[s] old and is a %s breed.\n", name, age, breed);
        myDog.makeSound();
        System.out.println("--------------------------------\n");

    }
    
}
