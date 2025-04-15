public class Country {

  private String name;
  private String foodImage;
  private String flagImage;
  private String symbolImage;

  public Country(String name, String foodImage, String flagImage, String symbolImage){
    this.name = name;
    this.foodImage = foodImage;
    this.flagImage = flagImage;
    this.symbolImage = symbolImage;
  }

  /**
   * Accessor Method for name
   * @return name 
   */
  public String getName(){
    return name;
  }
  /**
   * Accessor Method for food image
   * @return foodImage 
   */
  public String getFoodImage(){
    return foodImage;
  }
  /**
   * Accessor Method for flag image
   * @return flagImage 
   */
  public String getFlagImage(){
    return flagImage;
  }
  /**
   * Accessor Method for symbol image
   * @return symbolImage
   */
  public String getSymbolImage(){
    return symbolImage;
  }


  
}