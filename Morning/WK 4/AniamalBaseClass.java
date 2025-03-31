public class AniamalBaseClass
{
    private String animalName;
    private int animalAge;

    public  AniamalBaseClass(String name, int age)
    {
        this.animalName = name;
        this.animalAge = age;
    }

    public  void makeSound()
    {
        System.out.println("This animal makes a sound!.");
    }


    //accessors and mutators
    public String getAnimalName()
    {
        return animalName;
    }

    public int getAnimalAge()
    {
        return animalAge;
    }

    public void setAnimalName(String name)
    {
        animalName = name;
    }

    public void setAnimalName(int age)
    {
        animalAge = age;
    }

}