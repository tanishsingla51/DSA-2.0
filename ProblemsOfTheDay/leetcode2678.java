package ProblemsOfTheDay;

public class leetcode2678 {

    public static int numberOfSeniorCitizens(String[] details) {

        int ans = 0;

        for (int i = 0; i < details.length; i++) {
            int firstDigit = Character.getNumericValue(details[i].charAt(11));
            int secondDigit = Character.getNumericValue(details[i].charAt(12));

            if (firstDigit * 10 + secondDigit > 60) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };

        System.out.println(numberOfSeniorCitizens(details));
    }
}
