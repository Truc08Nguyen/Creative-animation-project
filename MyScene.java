import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MyScene extends Scene{

  private ArrayList<Country> allCountries;

  public MyScene() {
    allCountries = new ArrayList<Country>();
    allCountries.add(new Country("Japan", "sushi.png", "japan-flag.png", "ShintoShrine.png"));
    allCountries.add(new Country("Thailand", "tomyum.png", "thailandflag.png", "thaipagodas.png"));
    allCountries.add(new Country("Korea", "gimbap.png", "koreaflag.png", "geyongbokgung-palace.png"));
    allCountries.add(new Country("Vietnam", "pho.png", "vietnamflag.png", "nonla.png"));
  }

    public void drawScene() {
      for (Country country : allCountries) {
        movePlane();
        drawCountry(country);
      }
    }
  
  /**
   * Finds and returns a Country object by its name.
   *
   * @param name The name of the country to search for
   * @return The Country object if found; otherwise, null.
  */
  private Country findCountry(String name) {
    for (int i = 0; i < allCountries.size(); i++) {
      String countryName = allCountries.get(i).getName().toLowerCase();
      if (countryName.equals(name)) {
        return allCountries.get(i); 
      }
    }
    return null;
  }

  private void movePlane() {
    int x = 50;
      int y = 250;
      while (x < 300) {
        clear("white");  // Clear screen to white
        drawImage("plane.png", x, y, 100); // Draw the plane image
        x += 10; // Move right
        y -= 10; // Move upward
        pause(0.1); // Delay to animate
      }
  }

  private void drawCountry(Country country) {
    clear("white"); // Reset the screen
    setTextHeight(40);
    drawText(country.getName(), 135, 40);
    setTextHeight(20);
    setTextColor("black");
    drawImage(country.getFoodImage(), 220, 60, 175);
    drawImage(country.getFlagImage(), 20, 50, 175);
    drawImage(country.getSymbolImage(), 115, 220, 175);
    pause(4); // Pause to allow viewing before transitioning to the next country
  }
  



}