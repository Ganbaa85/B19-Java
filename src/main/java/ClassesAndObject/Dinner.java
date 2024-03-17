package ClassesAndObject;

public class Dinner {
    String goToStore;
    int meat;
    int vegetable;


    Dinner(){

    }
    Dinner(String goToStore,int meat,int vegetable){
        this.goToStore = goToStore;
        this.meat =meat;
        this.vegetable =vegetable;

    }
    Dinner(String prepare,int ingredient){this
            (prepare,ingredient,ingredient);}

    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        Dinner dinner1 = new Dinner("Prepare everythig",6);
        Dinner dinner2= new Dinner("Buy stuff",2,4);
    }


}
