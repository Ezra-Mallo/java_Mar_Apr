public class TestAnimalBaseClass
{
    public static void main (String[] args)
    {
        AnimalBaseClass animal = new AnimalBaseClass("Turks", 2);

        String name = animal.getAnimalName();
        int age = animal.getAnimalAge();
        System.out.printf("%s, is %d yrs old\n", name, age);
        animal.makeSound();
        System.out.println("------------------------\n");
        

        Cat aCat = new Cat("Tom the Cat", 3, "black");
        name = aCat.getAnimalName();
        age = aCat.getAnimalAge();
        String color = aCat.getCatColour();
        System.out.printf("%s, is %d yrs old and is %s in colour!\n", name, age, color);
        aCat.makeSound();
        System.out.println("------------------------\n");
        
        Dog aDog = new Dog("Steve the dog", 4, "Golden retriever");
        name = aDog.getAnimalName();
        age = aDog.getAnimalAge();
        String breed = aDog.getDogBreed();
        System.out.printf("%s, is %d yrs old and is a %s breed.!\n", name, age, breed);
        aDog.makeSound();
        System.out.println("------------------------\n");
        
    }
}
