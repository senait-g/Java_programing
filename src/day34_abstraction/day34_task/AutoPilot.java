package day34_abstraction.day34_task;

import day35_polymorphism.transportationTask.AutoPark;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void autoPark();
}
