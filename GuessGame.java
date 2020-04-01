public class GuessGame{
    //GuessGame has 3 instance varibale for the 3 Player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        //Create 3 Player objects and assign them to the instance variables above

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //decalre three variables to hold the three guesses the players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //decalre 3 variables to hold true or false based on a player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //create a target number that the players have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true){
            System.out.println("Number to guess is..." + targetNumber);

            //call each player's guess method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each player's guess
            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player3 guessed " + guessp3);

            //check if a player's guess is right and set that
            // player's iRight variable to true

            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game over!");
                break;

            } else {
                //otherwise stay in the loop and ask the players for another guess
                System.out.println("Players will have to guess again");
            }
        }


    }
}