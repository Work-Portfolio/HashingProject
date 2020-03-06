package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * This Class instantiates and populates two hash tables of FHhashQPwFind. They both store SongEntry Objects. One
 * is sorted by song ID number and the other by music genre
 * Created by zachrooney on 2/27/17.
 */
public class TableGenerator {
    private FHhashQPwFind <Integer,SongCompInt> tableByID ;
    private FHhashQPwFind <String,SongsCompGenre> tableByGenre ;
    private ArrayList<String> genres = new ArrayList<>();

    /**
     * Constructor that instantiates two hash tables of FHhashQPwFind and an arraylist to hold the music genre names.
     *
     */
    public TableGenerator()
    {
        tableByID = new FHhashQPwFind<>();
        tableByGenre = new FHhashQPwFind<>();
        genres = new ArrayList<>();

    }

    /**
     * Populates one FHhashQPwFind object with SongEntry objects (in wrapper class SongsInt) from allSongs array.
     * It sorts them by the SongEntry ID number
     * @param allSongs
     * @return tableByID
     */
    public FHhashQPwFind <Integer,SongCompInt> populateIDtable(SongEntry[] allSongs) {
        for (SongEntry e : allSongs)
        {
            SongCompInt newWrapper = new SongCompInt (e);
            tableByID.insert(newWrapper);
        }
        return tableByID;
    }

    /**
     * Populates one FHhashQPwFind object with SongEntry objects (in wrapper class SongsCompGenre) from allSongs array.
     * It sorts them by the SongEntry genre
     * @param allSongs
     * @return tableByGenre
     */
        public FHhashQPwFind<String, SongsCompGenre> populateGenreTable(SongEntry[] allSongs)
        {
            SongsCompGenre current;

            for (SongEntry x : allSongs) {

                try {
                    current = tableByGenre.find(x.getGenre());
                    current.addSong(x);
                }
                catch (NoSuchElementException e)
                {
                    SongsCompGenre newGenre = new SongsCompGenre(x.getGenre());
                    newGenre.addSong(x);
                    tableByGenre.insert(newGenre);
                    genres.add(newGenre.getName());
                }
            }
            return tableByGenre;
        }

    /**
     * Returns ArrayList<Strings> containing genre types in tableByGenre
     * @return genres
     */
    public ArrayList<String> getGenreNames() {
        return genres;
    }
}
