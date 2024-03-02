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

    @Test
    void gutterGame() {
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertThat(0).isEqualTo(g.score());
    }



}
