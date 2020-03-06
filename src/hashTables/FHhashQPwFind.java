package hashTables;
import java.util.*;
/**
 * This class extends FHhashQP class. It is also designed for hash tables. It allows items to be hashed and searched for
 * based on a KeyType.
 * Created by zachrooney on 2/27/17.
 */
public class FHhashQPwFind <KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E> {

    /**
     *  Searches FHhashQPwFind instances for object based on a KeyType. Returns object if found and throws
     *  NoSuchElementException if item with the same KeyType is not found.
     * @param key
     * @return E
     * @throws java.util.NoSuchElementException
     */
    protected E find(KeyType key) throws java.util.NoSuchElementException {
        int index = findPosKey(key);
        if(mArray[index].state == ACTIVE && mArray[index].data.equals(key))
            return mArray[index].data;
        throw new  NoSuchElementException();
    }

    /**
     *  Converts KeyType into its hashed value and returns that value.
     * @param key
     * @return int
     */
    protected int myHashKey(KeyType key) {
        int hashVal;

        hashVal = key.hashCode() % mTableSize;
        if(hashVal < 0)
            hashVal += mTableSize;

        return hashVal;
    }

    /**
     * Returns the index of where KeyType key
     * @param key
     * @return int
     */
    protected int findPosKey(KeyType key) {

        int kthOddNum = 1;
        int index = myHashKey(key);

        while ( mArray[index].state != EMPTY
                && !mArray[index].data.equals(key) )    //.data??
        {
            index += kthOddNum; // k squared = (k-1) squared + kth odd #
            kthOddNum += 2;     // compute next odd #
            if ( index >= mTableSize )
                index -= mTableSize;
        }
        return index;

    }
}
