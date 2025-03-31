public class AnimalBaseClass
{
    private String animalName;
    private int animalAge;

    public  AnimalBaseClass(String name, int age)
    {
        this.animalName = name;
        this.animalAge = age;
    }

    public void makeSound()
    {
        System.out.println("This animal makes a sound!");
    }


    // Setter and Getter
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
    public void setAnimalAge(int age)
    {
        animalAge = age;
    }


}