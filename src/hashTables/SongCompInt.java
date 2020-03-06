package hashTables;

import cs1c.*;



/**
 * This a wrapper class that for FHhashQPwFind. It holds a single SongEntry Object. It sorts the objects based on
 * SongEntry ID number.
 * Created by zachrooney on 2/27/17.
 */
public class SongCompInt implements Comparable<Integer>{

    SongEntry data;

    /**
     * Construtor that takes a SongEntry object as a parameter and sets it equal to SongEntry data.
     * @param newSong
     */
    public SongCompInt ( SongEntry newSong){
        data = newSong;
    }

    /**
     * Overrides superclass compareTo method to compare two instances of this class by int data.id
     * @param otherID
     * @return int
     */
    @Override
    public int compareTo (Integer otherID) {
        return otherID.compareTo(data.getID());       // Reverse?
    }

    /**
     * Overrides superclass toString method. Returns string value of SongEntry data held within
     * @return String
     */
    @Override
    public String toString () { return data.toString();}

    /**
     * Overrides superclass equals method to cmopare two instances of this class by int data.id
     * @param o
     * @return boolean
     */
   @Override
    public boolean equals (Object o) {
       if (!(o instanceof Integer)) {
           return false;
       }
       int otherID = (Integer) o;
       return data.getID() == otherID;
    }

    /**
     * Overrides superclass hashCode method. Hashes objects by the data.id number.
     * @return int
     */
    @Override
    public int hashCode() {
        return data.getID();}
}
