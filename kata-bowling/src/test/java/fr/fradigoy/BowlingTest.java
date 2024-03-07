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
    void gutterGame() {
        rollMany(20,0);
        assertThat(0).isEqualTo(g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    void allOnes () {
        rollMany(20, 1);
        assertThat(20).isEqualTo(g.score());
    }
}
