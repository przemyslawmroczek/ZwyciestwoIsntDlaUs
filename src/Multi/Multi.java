package Multi;

import Suma.Suma;

public class Multi {
    public Multi(){

    }

private Suma suma = new Suma();

    public int multi(int x, int y) {
        int result = 0;
        while (y != 0) {
            if ((y & 1) != 0) {
                result = suma.add(result, x);
            }
            x <<= 1;
            y >>>= 1;
        }
        return result;
    }
}
