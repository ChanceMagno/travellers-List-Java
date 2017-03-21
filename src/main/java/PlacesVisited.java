import java.util.List;
import java.util.ArrayList;

public class PlacesVisited {
  private String mCountry;
  private String mCity;
  public PlacesVisited(String country, String city) {
    mCountry = country.substring(0, 1).toUpperCase() + country.substring(1);
    mCity = city.substring(0, 1).toUpperCase() + city.substring(1);
  }
  public String getCountry() {
    return mCountry;
  }
  public String getCity() {
    return mCity;
  }
  public String getCountryAndCity() {
    return (mCity + ", "+ mCountry);
  }

}
