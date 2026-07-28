class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        int n = 0;
        int temp = numberToCheck;

        while (temp != 0){
            temp = temp/10;
            ++n;
        }

        int currentDigit = 0;
        int digitsLeft = numberToCheck;
        int armstrongNumber = 0;
        for (int i = n ; i>0 ; i--) {
            currentDigit = digitsLeft%10;
            digitsLeft /=10;
            armstrongNumber += Math.pow(currentDigit, n);
        }

        return armstrongNumber == numberToCheck;
    }
}

