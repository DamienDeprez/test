/**
 * Created by damien on 23/04/15.
 */
public class UnitTestClass {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int calculer(int a, int b)
    {
        int res = a+b;
        if(a==0)
            return 2*b;
        else if (b==0)
            return 2*a;
        else
            return res;
    }
}
