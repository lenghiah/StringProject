//data fields include all required by assignment plus numberOfGuitars and numberOfTwelveStringGuitars
private int numberOfStrings = 6;
private static int numberOfGuitars = 0, numberOfTwelveStringGuitars = 0;
StringPackage stringPackage = new StringPackage("guitar", 6);
private boolean tuned = false;
private boolean playing = false;

//simple constructor, built with tuned and playing false
public Guitar(){    
    numberOfGuitars++;
}

//constructor for different number of strings
//same basic build re: tuning and playing
public Guitar(int numberOfStrings) throws IOException{
        this.numberOfStrings = numberOfStrings;
        stringPackage = new StringPackage("guitar", numberOfStrings);
        if(numberOfStrings == 12) numberOfTwelveStringGuitars++;
}

//displays string notes using methods in StringPackage class
public void viewStringPackage(Guitar thisGuitar) throws IOException {
    String notes = thisGuitar.stringPackage.Notes();
    StringPackage.comboPrint("The strings on this guitar are: " + notes + "\n");
    }

//method to find out how many strings a particular guitar has
public int getNumberOfStrings() {
    return numberOfStrings;
}

//this is my unique method per assignment instructions
public static int getNumberOfGuitars(){
    return numberOfGuitars;
}

//this too
public static int getNumberOfTwelveStringGuitars() {
    return numberOfTwelveStringGuitars;
}

//method to determine if Guitar is tuned
public boolean isTuned() {
    return tuned;
}

//method to tune Guitar
public void tune() throws IOException {
    StringPackage.comboPrint("The Guitar is tuned." + "\n");
    tuned = true;
}

//method to see if Guitar is playing
public boolean isPlaying() {
    return playing;
}

//method to start Guitar playing
public void play() throws IOException {
    StringPackage.comboPrint("The Guitar is now playing." + "\n");
    playing = true;
}

//method to stop Guitar playing
public void stopPlay() throws IOException{
    StringPackage.comboPrint("The Guitar is no longer playing." + "\n");
    playing = false;
}
