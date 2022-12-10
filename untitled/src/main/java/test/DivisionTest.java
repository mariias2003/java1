package test;

import model.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void getId() {
        Division div = new Division(28281, "Aahan");
        assertEquals(28281,div.getId());
    }

    @Test
    void getName() {
        Division div = new Division(28281, "Aahan");
        assertEquals("Aahan",div.getName());
    }
}