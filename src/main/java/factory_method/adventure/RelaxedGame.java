package factory_method.adventure;

public class RelaxedGame extends Game {
    @Override
    public Room createRoom() {
        return new LovelyRoom();
    }
}
