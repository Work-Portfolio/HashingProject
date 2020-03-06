Zach Rooney
CS 1C

rooneyz-project07


Brief description of submitted files:

src/cs1c/MillionSongDataSubset.java
    - One object of class MillionSongDataSubset opens, reads, and parses a JSON file containing a list of songs and their information
      It stores the information in a array.

src/cs1c/SongEntry.java
    - One object of class SongEntry stores a simplified version of the information from MillionSongDataSubset.

src/cs1c/TimeConverter.java
    - One object of class TimeConverter converts a duration of time in seconds and converts to a string representation with
      hour, min, sec.

src/hashTables/FHhashQP
    - This class was gotten from our course examples. It is a class used to practice hashing. It holds an array and methods
      to hash and manage objects in the array.

src/hashTables/FHhashQPwFind
    - This class extends FHhasQP and adds the functionality of being abled to managed hashed items by a KeyType.


src/hashTables/HashEntry
    - One object of this class holds a generic object that has been hashed to insert into the hash table. It holds the
      object and has a variable for its state (ie Active or Inactive).

src/hashTables/MyTunes
    - This class contains the 'main()'. It was given to us by professor Bita Mazloom.
    - It opens and reads the music_genre_subset.Json file. Then populates then uses TableGenerator to populate the two hash
      tables and test them for functionality.

src/hashTables/SongComInt
    - This is a Wrapper class that holds a sing SongEntry Object and used by FHhashQPwFind.
    - It manages the SongEntry Objects by their ID number

src/hashTables/SongsCompGenre
    - This is a Wrapper class that holds a sing SongEntry Object and used by FHhashQPwFind.
    - It manages the songs by their song genre

src/hashTables/TableGenerator
    - This class creates and populates two FHhasQPwFind tables. One with SongCompInt objects, the other with SongCompGenre objects

resources/music_genre_subset.json
    - JSON file containing over 5,000 songs and their information. Used in creation of SongEntry Objects

resources/findIDs.txt
    - A text file containing a list of command words used to test the FHhashQPwFind hash table that is populated with
      SongComInt objects.

resources/findGenres.txt
    - A text file containing a list of command words used to test the FHhashQPwFind hash table that is populated with
      SongComGenre objects.

resources/RUN.txt
    - A copy of the console output from this program.

