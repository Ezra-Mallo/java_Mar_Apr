public class Cat extends AniamalBaseClass
{
    private String catColour;

    public Cat(String catName, int catAge, String colour)
    {
        super(catName, catAge);

        this.catColour = colour;
    }


    //accessors and mutators
    public String getCatColour()
    {
        return catColour;
    }

    public void setCatColour(String colour)
    {
        catColour = colour;
    }



    @Override
    public void makeSound()
    {
        super.makeSound();   // This calls the make sound of the Super/Parent/Base class =
        System.out.printf("%s says: Meow Meow!.\n", getAnimalName());
    }
}