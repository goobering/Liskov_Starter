package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ArtistTest {
    Artist artist;
    Square square;
    Circle circle;
    Triangle triangle;
    Trapezoid trapezoid;

    @Before
    public void before(){
        artist = new Artist();
        square = new Square();
        circle = new Circle();
        triangle = new Triangle();
        trapezoid = new Trapezoid();
    }

    @Test
    public void canDrawSquare(){
        assertEquals("I'm drawing a square!", artist.drawShape(square));
    }

    @Test
    public void canDrawCircle(){
        assertEquals("I'm drawing a circle!", artist.drawShape(circle));
    }

    @Test
    public void canDrawTriangle(){
        assertEquals("I'm drawing a triangle!", artist.drawShape(triangle));
    }

    @Test
    public void canDrawTrapezoid(){
        assertEquals("I'm drawing a trapezoid!", artist.drawShape(trapezoid));
    }
}