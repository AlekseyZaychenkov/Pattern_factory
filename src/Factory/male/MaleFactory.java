package Factory.male;

import Factory.AbstractFactory;
import Factory.Human;

/**
 * Created by Aleksey Zaychenkov on 14.05.2019.
 */

public class MaleFactory implements AbstractFactory {

    public Human getPerson (int age) {
        if (age <= KidBoy.MAX_AGE)
            return new KidBoy();
        if (age <= TeenBoy.MAX_AGE)
            return new TeenBoy();
        return new Man();
    }
}

