package university;

public class Ancestor {


    public Ancestor(String familyName, String raceOrigin, String locationOrigin) {
        this.familyName = familyName;
        this.raceOrigin = raceOrigin;
        this.locationOrigin = locationOrigin;
    }
    public String familyName;

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setRaceOrigin(String raceOrigin) {
        this.raceOrigin = raceOrigin;
    }

    public void setLocationOrigin(String locationOrigin) {
        this.locationOrigin = locationOrigin;
    }

   public String raceOrigin;
   public String locationOrigin;
    public String getFamilyName() {
        return familyName;
    }

    public String getRaceOrigin() {
        return raceOrigin;
    }

    public String getLocationOrigin() {
        return locationOrigin;
    }



}
