package Factory.female;

import Factory.AbstractFactory;
import Factory.Human;

/**
 * Created by Aleksey Zaychenkov on 14.05.2019.
 */

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE)
            return new KidGirl();
        if (age <= TeenGirl.MAX_AGE)
            return new TeenGirl();
        return new Woman();
    }
}
