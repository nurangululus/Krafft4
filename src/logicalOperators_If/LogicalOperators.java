package logicalOperators_If;

public class LogicalOperators {
    public static void main(String[] args) {
        /*

        &&-And
        ||-Or

             & - And              |- Or
     t --- t       t                 t
     t --- f       f                 t
     f --- t       f                 t
     f --- f       f                 f



         */
        int x=9;
        int y=7;
        int a=7;
        int b=11;

        boolean result =x>y & a<y;

    }
}
