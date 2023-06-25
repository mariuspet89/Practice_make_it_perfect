package FunctionalStyle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolutionFunctionalStyle {
    public static void main(String[] args) throws IOException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("dog", true, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("horse", true, true));

        print(animals, Animal::canHop);
    }

    public static void print(List<Animal> animals, CheckTrait checkIfHopper){
        for (Animal animal : animals){
            if(checkIfHopper.test(animal)){
                System.out.println(animal + "");
            }
        }
    }

}
