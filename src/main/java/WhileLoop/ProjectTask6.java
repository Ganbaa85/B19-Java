package WhileLoop;

public class ProjectTask6 {
    public static void main(String[] args) {
        String input = "IWantToLearnJava";
        StringBuilder result = new StringBuilder();
        for (int i = 0;i <input.length();i++){
            char currentChar = input.charAt(i);
            if (input.charAt(i) <=65 && input.charAt(i) >= 90){
                result.append(" ");
            }result.append(currentChar);
        }
        System.out.println(result.toString().trim());
    }
}
