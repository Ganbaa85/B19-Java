package university;

public class MeSelf extends Ancestor {
    String myBornPlace;



    int myBornYear;

    public MeSelf(String familyName, String raceOrigin, String locationOrigin) {
        super(familyName, raceOrigin, locationOrigin);
        


    }



    public Ancestor ancestor;




    public static void main(String[] args) {
        Ancestor ancestor = new Ancestor("Buriad"," West Mongolian "," Khuvsgul");
        MeSelf meSelf = new MeSelf("Ulaanbaatar","asd","zxc");
        System.out.println(meSelf);

    }
}
