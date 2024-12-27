public class CountLetterDigit {
    public static void main(String[] args) {
        String str1 = "Ama234ljith P~!@#$%^&*()_+K";
        int letterCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isDigit(str1.charAt(i))) {
                numberCount++;
            } else if (Character.isLetter(str1.charAt(i))) {
                letterCount++;
            } else if (!Character.isLetterOrDigit(str1.charAt(i)) && !Character.isWhitespace(str1.charAt(i))){
                specialCharCount++;
            }
        }
        System.out.println("Digit Count = " + numberCount + " Character Count = " + letterCount+ " Special Character Count =  "+specialCharCount);

    }
}