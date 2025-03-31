public class TestAniamalBaseClass
{
    public static void main(String[] args)
    {
        System.out.println("------------AnimalaBaseClass --------------");
        
        AniamalBaseClass animal = new AniamalBaseClass("Turks", 2);
        String name = animal.getAnimalName();
        int age = animal.getAnimalAge();
        System.out.printf("%s, is %d year[s] old\n", name, age);
        animal.makeSound();        
        System.out.println("--------------------------------");


        Cat myCat = new Cat("Tom the Cat", 2, "Black");

        name = myCat.getAnimalName();
        age = myCat.getAnimalAge();
        String color = myCat.getCatColour();
        
        System.out.println("------------Cat extends AnimalaBaseClass --------------");
        System.out.printf("%s, is %d year[s] old and is %s in colour\n", name, age, color);
        myCat.makeSound();
        System.out.println("--------------------------------\n");




        System.out.println("------------Dog extends AnimalaBaseClass --------------\n");
        Dog myDog = new Dog("Steeve the Dog", 3,"Brown", "Golden Retriever");

        name = myDog.getAnimalName();
        age = myDog.getAnimalAge();
        String breed = myDog.getDogBreed();

        System.out.printf("%s, is %d year[s] old, %s in colour and is a %s breed.\n", name, age,color, breed);
        myDog.makeSound();
        System.out.println("--------------------------------\n");

    }
    
}
