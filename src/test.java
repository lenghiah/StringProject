public class test {


public static void main(String[] args) throws IOException {

    //allows user to enter file to write from command line
    //satifies section 4 requirement
    if(args.length > 0)
        section4(args);         

    //create arrays to hold new instruments
    Guitar[] sixStrings = new Guitar[4];

    //create 4 new 6-String Guitars, 12-String Guitars and Violins
    //for a total of 12 new instruments (assignment called for 10)
    for (int i = 0; i < 4; i++){
        sixStrings[i] = new Guitar();   
    }

    howMany(); //displays number of instruments created     

    //Display status of the instruments
    statusAll(sixStrings);

    //Tune the instruments and start them playing
    for(int i = 0; i < sixStrings.length; i++){
        sixStrings[i].tune();
        sixStrings[i].play();

    }//tune and start play

    statusAll(sixStrings);

    //stop instrument from playing
    for(int i = 0; i < sixStrings.length; i++){
        sixStrings[i].stopPlay();
    }//stop playing

    statusAll(sixStrings, twelveStrings, violins);      

    //created this 3 string guitar to test what happens with my "exception" that isn't an exception
    System.out.println("......................");
    Guitar weirdo = new Guitar(3);
    weirdo.isPlaying();
    weirdo.isTuned();

    //To show that weirdo doesn't increase numberOfTwelveStringGuitars
    howMany(); 

}//main

//getNumberOf... is my unique method
//it displays how many instruments of each type were created
public static void howMany() throws IOException{
    StringPackage.comboPrint("Number of 6-String Guitars is: " + 
    		Guitar.getNumberOfGuitars() + "\n");
}//howMany

//displays all status of ALL instruments
//I created this to avoid repeating code in the main
public static void statusAll(Guitar[] sixStrings) throws IOException{
    instrumentStatus(sixStrings);

}//statusAll

//displays current status of all guitars
//uses getNumberofStrings method to determine type of guitar
public static void instrumentStatus(Guitar[] guitars) throws IOException{
    for (int i = 0; i < guitars.length; i++){
        if (guitars[i].getNumberOfStrings() == 12)
            StringPackage.comboPrint("Six String Guitar " + (i +1) + ": ");
        else 
            StringPackage.comboPrint("Six String Guitar " + (i + 1) + ":");
        if (guitars[i].isPlaying()) 
            StringPackage.comboPrint("Is currently playing.");
        else
            StringPackage.comboPrint("Is currently not playing.");
        if (guitars[i].isTuned())
            StringPackage.comboPrint("Is currently tuned.");
        else
            StringPackage.comboPrint("Is currently not tuned.");
        guitars[i].viewStringPackage(guitars[i]);
    }//for
}//instrumentStatus(Guitar[])


    catch (IOException io){
  System.out.println("Sorry that file is not found " + io);
    }//catch
}//section4
