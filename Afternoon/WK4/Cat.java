public class Cat extends AnimalBaseClass
{
    private String catColour;

    public Cat(String catName, int catAge, String color)
    {
        super(catName, catAge);
        this.catColour = color;
    }

    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.printf("%s says: Meow Meow!\n",getAnimalName());
    }
    
    public String getCatColour()
    {
        return catColour;
    }

    public void setCatColour(String color)
    {
        catColour = color;
    }
}