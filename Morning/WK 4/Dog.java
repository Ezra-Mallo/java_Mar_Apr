public class Dog extends Cat
{
    private String dogBreed;

    public Dog(String dogName, int dogAge, String dogColor, String breed)
    {
        super(dogName, dogAge, dogColor);

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