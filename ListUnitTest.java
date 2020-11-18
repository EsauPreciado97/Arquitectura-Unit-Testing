/*
    Luis Esaú Preciado Martínez
    A01631211
    Software Architecture
 */

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListUnitTest {
    private List<Integer> list;
    public void newList() {
        list = new ArrayList<>();
    }

    // TEST CASES - UNIT TESTS ONLY

    @Test
    // Getting list size
    public void getListSize() {
        newList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(5, list.size());
    }

    @Test
    // Getting List size if empty
    public void sizeIfEmpty(){
        newList();
        assertEquals(0, list.size());
    }

    @Test ( expected = NullPointerException.class )
    // Getting List size if null
    public void sizeIfNull(){
        List <Integer> list = null;
        list.size();
    }

    @Test
    // Getting list size when removing item
    public void getSizeRemoving(){
        newList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(5, list.size());
        list.remove(0);
        assertEquals(4, list.size());
    }

    @Test
    // Cleaning all elements of a list
    public void clearList(){
        newList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    // Cleaning a list when is empty
    public void clearEmpty(){
        newList();
        list.clear();
        assertEquals(0, list.size());
    }

    @Test ( expected = NullPointerException.class )
    // Cleaning a list when is null
    public void clearNull(){
        List <Integer> list = null;
        list.clear();
    }


    @Test
    // Adding a new item to list
    public void addItem(){
        newList();
        this.list.add(0);
        assertEquals(0, (int) list.get(0));
    }

    @Test
    // Adding array to list
    public void addItemArray(){
        newList();
        int [] array = new int[5];
        array[0] = 1;
        this.list.add(array[0]);
        assertEquals(array[0],(int) list.get(0));
    }

    @Test( expected = NullPointerException.class )
    // Adding item to null list
    public void addItemToNullList() {
        List<Integer> list = null;
        list.add(0);
    }

    @Test
    // Verify if certain item exists in list
    public void itemExists(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertTrue(list.contains(1));
    }

    @Test
    // Verify if certain item exists on empty list
    public void itemExistOnEmpty(){
        newList();
        assertFalse(list.contains(0));
    }

    @Test
    // Verify if item doesn't belong on list
    public void fakeItem(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertFalse(list.contains(3));
    }

    @Test
    // Find element by index
    public void findByIndex(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(1,(int) list.get(1));
    }

    @Test( expected = IndexOutOfBoundsException.class )
    // Find element by index out of bounds
    public void findByIndexOutside(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        list.get(3);
    }

    @Test( expected = IndexOutOfBoundsException.class )
    // Find element by index in empty list
    public void findByIndexEmpty(){
        newList();
        list.get(1);
    }

    @Test
    // Search index of an element
    public void searchIndex(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(1,(int) list.indexOf(1));
    }

    @Test
    // Search index of element even if its repeated on the list
    public void searchMultipleIndex(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(1);
        this.list.add(2);
        assertEquals(1,(int) list.indexOf(1));
    }

    @Test
    // Search index of non existing item
    public void searchInvalidIndex(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(-1,(int) list.indexOf(3));
    }

    @Test
    // Remove item of list by index
    public void removeByIndex(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        assertEquals(1,(int) list.get(1));
        this.list.remove(1);
        assertEquals(2,(int) list.get(1));
    }

    @Test( expected = IndexOutOfBoundsException.class )
    // Remove item when index out of bounds
    public void removeByIndexOutBounds(){
        newList();
        this.list.add(0);
        this.list.add(1);
        this.list.add(2);
        list.remove(3);
    }

    @Test( expected = NullPointerException.class )
    // Remove item on a null list
    public void removeItemByIndexWhenNullPointer(){
        List<Integer> list = null;
        list.remove(0);
    }
}
