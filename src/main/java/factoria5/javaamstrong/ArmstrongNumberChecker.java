package factoria5.javaamstrong;

public class ArmstrongNumberChecker {
    
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int digitsCount = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitsCount);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
