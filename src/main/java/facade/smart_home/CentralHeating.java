package facade.smart_home;

public class CentralHeating implements Heating {
    @Override
    public void heatOn() {
        System.out.println("Heating is on");
    }

    @Override
    public void heatOff() {
        System.out.println("Heating is off");
    }
}
