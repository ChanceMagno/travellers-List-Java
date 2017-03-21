import org.junit.*;
import static org.junit.Assert.*;

public class PlacesVisitedTest {

  @Test
  public void PlacesVisited_instantiatesCorrectly_true() {
    PlacesVisited newPlace = new PlacesVisited("Italy", "Venice");
    assertEquals(true, newPlace instanceof PlacesVisited);
  }
  @Test
  public void PlacesVisited_returnsCountry_true() {
    PlacesVisited newPlace = new PlacesVisited("Italy", "Venice");
    assertEquals("Italy", newPlace.getCountry());
  }
  @Test
  public void PlacesVisited_returnsCity_true() {
    PlacesVisited newPlace = new PlacesVisited("Italy", "Venice");
    assertEquals("Venice", newPlace.getCity());
  }
  @Test
  public void PlacesVisited_returnsBoth_true() {
    PlacesVisited newPlace = new PlacesVisited("Italy", "Venice");
    assertEquals("Venice, Italy", newPlace.getCountryAndCity());
  }
}
