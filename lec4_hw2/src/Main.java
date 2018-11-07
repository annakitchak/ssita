/**
 * Created by annakitchak on 07.11.18.
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Rocky");
        d1.setBreed(Breed.AMERICAN_BULLDOG);
        d1.setAge(3);
        Dog d2 = new Dog();
        d2.setName("Rex");
        d2.setBreed(Breed.BARBET);
        d2.setAge(7);
        Dog d3 = new Dog("Mick", Breed.BOERBOEL, 9);
        Dog d4 = new Dog("Jack", Breed.AMERICAN_BULLDOG, 4);
        Dog d5 = new Dog("Rex", Breed.BOERBOEL, 4);
        Dog[] dogs = {d1, d2, d3, d4, d5};
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    String nm = dogs[i].getName();
                    System.out.println("there is dog with the same name: " + nm);
                }
            }
        }
        Dog dmax = d1;
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > dmax.getAge()) {
                dmax = dogs[i];

            }
        }
        System.out.println(dmax);
    }
}

