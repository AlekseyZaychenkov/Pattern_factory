package Factory;


import Factory.female.FemaleFactory;
import Factory.male.MaleFactory;

/**
 * Created by Aleksey Zaychenkov on 14.05.2019.
 */

public class FactoryProducer {
    public static enum HumanFactoryType {MALE, FEMALE};

    public static AbstractFactory getFactory (HumanFactoryType humanFactoryType) {
        if (humanFactoryType == HumanFactoryType.MALE)
            return (AbstractFactory) new MaleFactory();
        if (humanFactoryType == HumanFactoryType.FEMALE)
            return new FemaleFactory();
        return null;
    }
}