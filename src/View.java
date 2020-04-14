public class View {
    User user = new User();
    Model model = new Model(this, user);
    View(){
        this.welcome();
        model.makeCode();
        model.playGame();
    }
    //Welkomswoord
    public void welcome(){
        System.out.println("Welkom bij Mastermind");
    }
    //Dots worden geprint
    public void showDot(){
        System.out.print(".");
    }
    //Instructie voor het woord dat moet worden ingevuld
    public void showInstructions(){
        System.out.println("Raad de lettercode bestaande uit a-f of typ q om te stoppen");
    }
    //Fout voor te veel letters
    public void tooManyLetters(){
        System.out.println("Te veel letters getypt");
    }
    //Tekst voor het einde van het spel
    public void endGame(){
        System.out.println("Bedankt voor het spelen");
    }
    //Tekst voor het aantal correcte letters op juiste plaats
    public void showCorrectPlace(int correctePlaats) {
        System.out.println("Aantal correcte letters op juiste plaats is " + correctePlaats);
    }
    //Tekst voor het aantal correcte letters maar niet op zelfde plaats
    public void showKomtVoor(int komtVoor) {
        System.out.println("Aantal correcte letters maar niet op juiste plaats is " + komtVoor);
    }

    public void emptySpace() {
        System.out.println("");
    }
}
