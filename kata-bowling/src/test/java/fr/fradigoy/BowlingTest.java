package fr.fradigoy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    private Game g;
    @BeforeEach
    void avantChaqueTest() {
        g = new Game();
    }

    @Test
    void canRoll() {
        g.roll(0);
    }





}
