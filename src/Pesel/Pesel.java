package Pesel;

public class Pesel {


    boolean pesel(int[] pesel) {

        if (pesel == null || pesel.length != 11) {
            return false;
        }

        if (!checkControlNumber(pesel)) {
            return false;
        }


        return true;
    }

    private boolean checkControlNumber(int[] pesel) {

        int sum = pesel[0] +
                3 * pesel[1] +
                7 * pesel[2] +
                9 * pesel[3] +
                pesel[4] +
                3 * pesel[5] +
                7 * pesel[6] +
                9 * pesel[7] +
                pesel[8] +
                3 * pesel[9];
        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        if (sum == pesel[10]) {
            return true;
        }
        return false;
    }


}
