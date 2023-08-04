public class Cat {

    String name;

    CatBreed breed;


    public Cat(){}

    public Cat(String name, CatBreed breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }
}
