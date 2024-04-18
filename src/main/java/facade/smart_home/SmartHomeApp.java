package facade.smart_home;

public class SmartHomeApp {
    public static void main(String[] args) {
        Lights myLights = new LivingRoomLights();
        Heating myHeating = new CentralHeating();
        SecuritySystem mySecurity = new HomeSecuritySystem();
        SmartHomeFacade myHome = new SmartHomeFacade(myLights, myHeating, mySecurity);

        // call "easy" methods provided by the facade
        // a click of the home/away button may trigger these
        myHome.arriveHome();
        myHome.leaveHome();

        // directly call methods on the subsystems, if needed
        // these are not part of the facade, and may be called in response
        // to a specific event
        mySecurity.readLog();
    }
}
