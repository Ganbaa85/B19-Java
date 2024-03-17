public class LogicalOperators
{ public static void main(String[] args) {
    // Logical OR | its called Pipe
    boolean isWeekend = true;
    boolean isHoliday = false;
    boolean goOut = isWeekend | isHoliday; // true or | false
    System.out.println(goOut);
    System.out.println(!isWeekend | isHoliday);
    boolean hasTicket = true;
    boolean hasVisa = false;
    boolean canTravel = hasTicket | hasVisa;
    System.out.println(canTravel);
    boolean result = (true | false) | (false | false);
    System.out.println(result);
    System.out.println("_____________________________");
    // Logical And &
    // Both result have to be true
    boolean isProductInStock = true;
    boolean isProductDiscontinued = false;
    boolean isProductOutOFStock = false;
    System.out.println((isProductDiscontinued | isProductOutOFStock));
    boolean isWeatherSunny = true;
    boolean isAirQualityGood = true;
    boolean isSuitableForOutdoorEvent = false;
    System.out.println(isWeatherSunny & (isAirQualityGood | isSuitableForOutdoorEvent));
    // Short - circuit Or || double pipes
    boolean isSunny = false;
    boolean isWindy = true;
    boolean goForWalk = isSunny || isWindy; // (false || true = false)
    System.out.println(goForWalk);
    System.out.println("__________Short circuit AND ______&&____");
    boolean hasGoodCreditScore = true;
    boolean hasGoodIncome = true;
    System.out.println(hasGoodCreditScore && hasGoodIncome);
    boolean isEmergencyExitAccessible = false;
    boolean isFireEquipmentFunctional = true;
    boolean isEmergencyMedicalKitAvialable = false;
    System.out.println(isEmergencyExitAccessible && isFireEquipmentFunctional);
    System.out.println(isEmergencyExitAccessible && (isFireEquipmentFunctional & isEmergencyMedicalKitAvialable));
    boolean a1 = true;
    boolean b1 = false;
    boolean c1 = true;
    boolean result1 = (a1 | b1) & (c1 || b1);
    System.out.println(result1);

    boolean a2 = true;
    boolean a3 = false;
    boolean a4 = true;
    boolean a5 = false;
    boolean result2 = (a2 || a3) && (a4 | a5);
    System.out.println(result2);

    boolean x1 = true;
    boolean y1 = false;
    boolean z1 = true;
    boolean result3 = x1 && y1 || z1 && !y1;
    System.out.println(result3 );

















}
}
