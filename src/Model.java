

import java.util.Random;

public class Model {
    View view;
    User user;
    char[] code;
    String codewoord;
    Boolean woordFout = true;

    Model(View view, User user){
        this.view = view;
        this.user = user;
    }

    //Code wordt gemaakt en dots worden op het scherm geprint via de view
    public void makeCode(){
        Random random = new Random();
        code = new char[4];
        for (int i = 0; i < 4; i++) {
            code[i] = (char) (random.nextInt(6) + 97);
            view.showDot();
        }
        view.emptySpace();
        codewoord = new String(code);
    }

    //Zolang het geraden woord door de user fout is of er een q wordt getypt, wordt het spel gespeeld
    public void playGame(){
        while(woordFout){
            view.showInstructions();
            String woord = user.tryWord();
            if (woord.equals("q")){
                woordFout = false;
            } else if (woord.length() > 4){ //Als de lengte van het woord te lang is komt er een fout
                view.tooManyLetters();
            } else {
                this.checkWord(woord);
            }
        }
        view.endGame();
    }

    //Per letter wordt gekeken of het goed staat of dat het op een verkeerde plek staat
    public void checkWord(String woord) {
        int correctePlaats = 0;
        int komtVoor = 0;
        for (int i = 0; i < 4; i++) {
            if (woord.charAt(i) == code[i]) {
                correctePlaats++;
            } else if (codewoord.indexOf(woord.charAt(i)) != -1) {
                komtVoor++;
            }
        }
        if (correctePlaats == 4) {
            woordFout = false;
        } else {
            view.showCorrectPlace(correctePlaats);
            view.showKomtVoor(komtVoor);
        }
    }

}
