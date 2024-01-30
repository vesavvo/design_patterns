package decorator.orator;

public class ReversingDecorator extends OratorDecorator {

        public ReversingDecorator(Orator orator) {
            super(orator);
        }

        @Override
        public void say(String message) {
            StringBuilder sb = new StringBuilder(message);
            super.say(sb.reverse().toString());
        }
}
