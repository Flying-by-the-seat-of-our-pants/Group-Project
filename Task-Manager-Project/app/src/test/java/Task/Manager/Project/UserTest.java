package Task.Manager.Project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testIsEmpty() {
        List<TDList> list = new ArrayList<>();
        assertTrue(list.isEmpty());
        list.add(0, new TDList("tstName"));
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestListTDList(){
        TDList listOne = new TDList("list1");
        TDList listTwo = new TDList("list2");
        TDList listThree = new TDList("list3");


        List<TDList> list = new ArrayList<>();
        list.add(listOne);
        list.add(listTwo);
        list.add(listThree);
        assertEquals(listOne, list.get(0));
        assertEquals(listTwo, list.get(1));
        assertEquals(listThree, list.get(2));

    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}