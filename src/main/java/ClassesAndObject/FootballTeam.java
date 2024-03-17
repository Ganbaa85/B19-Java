package ClassesAndObject;

public class FootballTeam {
    /*
     *attributes/fields (instance/non-static and static)
     * -instance fields --- for ex: team name,coach , location, year established.
     * methods/functions(intance/non static and static)
     * -instance methods --- play , defend ,offence , pass, win and lose.
     */
    static int totalFootballTeams = 0;
    // final fields
    /*
    final keyword


     */
    String teamName;
    String country;
    int yearEstablished;
    String currentCoach;
    String[] currentTournaments;

    static int getTotalFootballTeams() {
        return totalFootballTeams;
    }

    static void increaseTotalFoootballTeams() {
        totalFootballTeams++;
    }

    void play() {
        System.out.println("The team " + teamName + " is playing.");
    }

    String play(String teamName) {
        return "The team " + teamName + " is playing.";
    }
  /*
    How to overload a method in Java?
    * Different number of parameters
    for example:
    drawLine(int pointA); 1 parameter
    drawLine(int pointA, int pointB); 2 parameters
    * Different type of parameters
    for example:
    drawLine(int pointA, int pointB); // integer
    drawLine(double pointA, double pointB); // double
     */

    void defence() {
        System.out.println("The team " + teamName + " is on defence");
    }

    void offence() {
        System.out.println("The team " + teamName + " is on offence");
    }


}
