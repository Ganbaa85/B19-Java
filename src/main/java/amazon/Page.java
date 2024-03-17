package amazon;

public abstract class Page {
   public Logo logo;
   abstract Logo getLogo();
   public Location location;
   abstract  Location getCurrentLocation();
   public SearchBar searchBar;
   public Language language;
   abstract Language selectLanguage();


}
