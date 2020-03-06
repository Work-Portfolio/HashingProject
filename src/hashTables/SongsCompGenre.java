package hashTables;

import cs1c.*;
import java.util.*;

/**
 *  This a wrapper class that for FHhashQPwFind. It holds an ArrayList<SongEntry> sorted by genre
 * Created by zachrooney on 2/27/17.
 */
public class SongsCompGenre implements Comparable<String>
{
    String name;
    ArrayList<SongEntry> data;

    /**
     * Constructor takes in string of genre type and sets it equal to name. Instantiates ArrayList</SongEntry> data.
     * @param genre
     */
    public SongsCompGenre (String genre){
        name = genre;
        data = new ArrayList<>();
    }

    /**
     * Returns string 'name' representing the genre
     * @return name
     */
    public String getName() {

        return name;
    }

    /**
     * Returns ArrayList<SongEntry> data holding the SongEntry objects of this genre type
     * @return data
     */
    public ArrayList<SongEntry> getData() {
        return data;
    }

    /**
     * Adds SongEntry object to ArrayList<SongEntry> data held within this object.
     * @param e
     */
    public void addSong(SongEntry e)
    {
        data.add(e);
    }

    /**
     * Overrides superclass compare to method so that instances of this class are compared by the string name (genre)
     * @param other
     * @return int
     */
    @Override
    public int compareTo(String other) {
        return name.compareTo(other);
    }

    /**
     * Overrides superclass toString method. Returns a string concatination of all SongEntry objects held within
     * ArrayList data.
     *
     * @return String
     */
    @Override
    public String toString () {
        String wholeList = "";
        for (SongEntry e : data){
            wholeList += e.toString() + "\n";
        }
        return wholeList;
    }

    /**
     * Overrides superclass equals method so that objects are compared by string 'name'.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals (Object o)
    {     if (!(o instanceof String)) {
        return false;
    }
        String otherName = (String) o;
        return name.equals(otherName);
    }

    /**
     * Overrides superclass hashCode method so that objects are hashed by string 'name'
     * @return int hash value of string 'name'
     */
    @Override
    public int hashCode() { return name.hashCode();}
}
