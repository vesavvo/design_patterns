package decorator.orator;

public class BackwardsDecorator extends OratorDecorator {

        public BackwardsDecorator(Orator orator) {
            super(orator);
        }

        @Override
        public void say(String message) {
            StringBuilder sb = new StringBuilder(message);
            super.say(sb.reverse().toString());
        }
}
