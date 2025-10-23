# Algorithm for JavaGuesser
## Algorithm for JavaGuesser constructor
1. create a Scanner object for input
1. create a string to store user input called select
1. bool keepGoing = true;
1. while keepGoing
    1. print "0) exit"
    1. print "1) Human Guesser"
    1. print "2) Computer Guesser"
    1. print "please enter 0-2: "
    1. put user input into select
    1. if select.equals("0")
        1. keepGoing = false;
    1. else if select.equals("1")
        1. humanGuesser();
    1. else if select.equals("2")
        1. computerGuesser();
    1. else
        1. print "invalid input, please try again"
    1. end if
1. end while
## Algorithm for humanGuesser
1. create a Scanner object for input
1. print "human guesser"
1. Create an int variable for the correct number and fill it with a random number between 1 and 100
1. Create an int variable to track the number of turns the user has taken and initialize it to 1
1. bool keepGoing = true;
1. while keepGoing == true
    1. Print out a line showing the turn number and asking the user to guess a number
    1. Create an int variable for the user's guess
    1. If the user's guess == the correct number
        1. Set keepGoing to false
        1. Print out a line telling the user that they got it right
    1. Else if the guess was too high (guess > correct)
        1. Print out a line telling the user that their guess was too high
        1. Increase the number of turns by 1
    1. Else
        1. Print out a line telling the user that their guess was too low
        1. Increase the number of turns by 1
    1. end if
1. End loop
1. If the number of guesses < 7
    1. Print out a line telling the user they did a great job
1. Else if the number of guesses == 7
    1. Print out a line telling the user they got the right answer in an average amount of turns
1. Else
    1. Print out a line telling the user they could've taken less turns
1. end if
1. End humanGuess
## Algorithm for computerGuesser
1. create a Scanner object for input
1. print "computer guesser"
1. int guess = 50;
1. int guessChange = 25;
1. string correct = "";
1. bool keepGoing = true;
1. while keepGoing
    1. print "I guess " + guess;
    1. print "Too (H)igh, too (L)ow, or (C)orrect? "
    1. put user input into correct
    1. if (correct.toUpperCase().equals("C"))
        1. keepGoing = false;
    1. else if (correct.toUpperCase().equals("L"))
        1. guess += guessChange;
        1. guessChange /= 2;
    1. else if (correct.toUpperCase().equals("H"))
        1. guess -= guessChange;
        1. guessChange /= 2;
    1. else
        1. print "invalid input, please try again";
1. end while
1. end computerGuesser
