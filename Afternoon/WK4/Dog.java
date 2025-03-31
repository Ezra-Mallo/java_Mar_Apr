public class Dog extends Cat
{
    private String dogBreed;

    public Dog(String dogName, int dogAge, String breed, String dogColor)
    {
        super(dogName, dogAge, dogColor);
        this.dogBreed = breed;
    }


    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.printf("%s says: Woof Woof!\n",getAnimalName());
    }

    public String getDogBreed()
    {
        return dogBreed;
    }

    public void setDogBreed(String breed)
    {
        dogBreed = breed;
    }

}
