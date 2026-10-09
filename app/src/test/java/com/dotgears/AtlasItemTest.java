package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AtlasItemTest {

    @Before
    public void setUp() {
        AtlasItem.resetIdCounter();
    }

    @Test
    public void testCreationAndIncrementalIds() {
        AtlasItem item1 = new AtlasItem("bg_day", 288, 512, 0.0f, 0.0f, 0.28125f, 0.5f);
        assertEquals("bg_day", item1.name);
        assertEquals(288, item1.width);
        assertEquals(512, item1.height);
        assertEquals(0.0f, item1.u1, 0.00001f);
        assertEquals(0.0f, item1.v1, 0.00001f);
        assertEquals(0.28125f, item1.u2, 0.00001f);
        assertEquals(0.5f, item1.v2, 0.00001f);
        assertEquals(0, item1.id);

        AtlasItem item2 = new AtlasItem("bg_night", 288, 512, 0.28515625f, 0.0f, 0.28125f, 0.5f);
        assertEquals("bg_night", item2.name);
        assertEquals(1, item2.id);
    }

    @Test
    public void testParseActualAtlasTxt() throws Exception {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("atlas.txt");
        if (stream == null) {
            // Also test via direct file stream from assets if classloader path varies
            stream = new java.io.FileInputStream("src/main/assets/atlas.txt");
        }
        assertNotNull("atlas.txt must be accessible", stream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        List<AtlasItem> items = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().length() > 1) {
                String[] parts = line.trim().split("\\s+");
                AtlasItem item = new AtlasItem(
                        parts[0],
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),
                        Float.parseFloat(parts[3]),
                        Float.parseFloat(parts[4]),
                        Float.parseFloat(parts[5]),
                        Float.parseFloat(parts[6])
                );
                // Coordinate transformation from C0210g lines 118-119:
                item.u2 = item.u1 + item.u2;
                item.v2 = item.v1 + item.v2;
                items.add(item);
            }
        }
        reader.close();

        // Original atlas.txt has 71 sprite definitions (line 72 is trailing newline)
        assertEquals(71, items.size());

        // Verify first entry: bg_day 288 512 0.0 0.0 0.28125 0.5
        AtlasItem bgDay = items.get(0);
        assertEquals("bg_day", bgDay.name);
        assertEquals(288, bgDay.width);
        assertEquals(512, bgDay.height);
        assertEquals(0.0f, bgDay.u1, 0.00001f);
        assertEquals(0.0f, bgDay.v1, 0.00001f);
        assertEquals(0.28125f, bgDay.u2, 0.00001f);
        assertEquals(0.5f, bgDay.v2, 0.00001f);

        // Verify bird0_0: 48 48 0.0 0.9472656 0.046875 0.046875
        AtlasItem bird = items.get(2);
        assertEquals("bird0_0", bird.name);
        assertEquals(48, bird.width);
        assertEquals(48, bird.height);
        assertEquals(0.046875f, bird.u2, 0.00001f); // 0.0 + 0.046875
        assertEquals(0.9941406f, bird.v2, 0.0001f); // 0.9472656 + 0.046875
    }
}
