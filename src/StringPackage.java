public class StringPackage {

//data fields include a String[] to hold string names as per the assignment
private static final String GUITAR = "guitar", VIOLIN = "violin";
String[] stringArray;

//builds the StringPackage for each instrument
//can be amended to include new instruments as they're built
//don't know how to throw exceptions yet so this will have to do as a substitute
public StringPackage(String typeOfInstrument, int numberOfStrings) {
    if(numberOfStrings == 6 && typeOfInstrument.equalsIgnoreCase(GUITAR)){
        String temp = "E A D G B E";
        stringArray = temp.split(" ");
    }//6 string
    else if(numberOfStrings == 12 && typeOfInstrument.equalsIgnoreCase(GUITAR)){
        String temp ="E E A A D D G G B B E E";
        stringArray = temp.split(" ");
    }//12 string
    else if (numberOfStrings == 4 && typeOfInstrument.equalsIgnoreCase(VIOLIN)){
        String temp = "G D A E";
        stringArray = temp.split(" ");
    }//violin
    else
        System.out.println("***Exception! " + numberOfStrings + " string "+ typeOfInstrument + " has not been created yet!***");

}//StringPackage

//.length method to for use in loops, etc.
public int length(){
    int length = stringArray.length;
    return length;
}

//builds string for notes display
//used by viewStringPackage in Guitar and Violin
public String Notes(){
    StringBuilder notes = new StringBuilder();
    for(int i = 0; i < stringArray.length; i++){
        notes.append(stringArray[i] + " ");
    }
    String notes1 = notes.toString();
    return notes1;
}

public static void comboPrint(String myString) throws IOException {
    boolean append = true;
  FileWriter myOutFile = new FileWriter("GuitarViolin.txt", append);  
  PrintWriter fileOut = new PrintWriter(myOutFile); 
  System.out.println(myString);
  fileOut.println(myString);
  fileOut.close();
}
