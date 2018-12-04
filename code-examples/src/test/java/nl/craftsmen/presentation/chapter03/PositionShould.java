package nl.craftsmen.presentation.chapter03;

import nl.craftsmen.presentation.aliexpress.Position;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PositionShould {

    @Test
    public void beEqualIfXAndYAreEqual() {
        Position position = new Position(100,100);
        Position position1 = new Position(100,100);

        assertThat(position.equals(position1), is(true));
    }

    @Test
    public void beNotEqualIfXAndYAreNotEqual() {
        Position position = new Position(100,50);
        Position position1 = new Position(100,100);

        assertThat(position.equals(position1), is(false));
    }
}