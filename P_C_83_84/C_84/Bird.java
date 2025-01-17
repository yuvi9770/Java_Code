package P_C_83_84.C_84;

public abstract class Bird implements FlyAble {

    private final String Breed;

    public Bird(String breed) {
        Breed = breed;
    }

    public String getBreed() {
        return Breed;
    }

}
