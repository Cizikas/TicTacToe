import org.junit.Test;

import static org.junit.Assert.*;

public class MapTest {
    Map map = new Map();

    @Test
    public void getHeight() {
        assertEquals(5, map.getHeight());
    }

    @Test
    public void getWidth() {
        assertEquals(11, map.getWidth());
    }
}