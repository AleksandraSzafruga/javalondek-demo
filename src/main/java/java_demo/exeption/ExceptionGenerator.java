package java_demo.exeption;

import java.util.Random;

public class ExceptionGenerator {

    public String nick() throws NoNickException {
        Random random = new Random();
        if (random.nextInt(180) % 2 == 0){
            return "althris";
        } else {
            throw  new NoNickException("I have no nick");
        }
    }
}