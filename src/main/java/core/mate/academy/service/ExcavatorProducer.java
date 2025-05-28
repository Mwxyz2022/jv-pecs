package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final List<Excavator> excavators = new ArrayList<>();

        Excavator excavator1 = new Excavator();
        excavator1.setName("Excavator A1");
        excavator1.setColor("Red");
        excavator1.setArmLength(6.5);
        excavator1.setBucketCapacity(500);
        excavators.add(excavator1);

        Excavator excavator2 = new Excavator();
        excavator2.setName("Excavator A2");
        excavator2.setColor("Green");
        excavator2.setArmLength(7.0);
        excavator2.setBucketCapacity(600);
        excavators.add(excavator2);

        return excavators;
    }
}
