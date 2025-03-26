public class Dog extends AniamalBaseClass
{
    private String dogBreed;

    public Dog(String dogName, int dogAge, String breed)
    {
        super(dogName, dogAge);

        this.dogBreed = breed;
    }


    //accessors and mutators
    public String getDogBreed()
    {
        return dogBreed;
    }

    public void setDogBreed(String breed)
    {
        dogBreed = breed;
    }


    @Override
    public void makeSound()
    {
        System.out.printf("%s says: Woof Woof!.\n", getAnimalName());
    }
}