package uk.ac.ebi.reactionblast.tools.matrix;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author Syed Asad Rahman <asad @ ebi.ac.uk>
 */
public class Maths {

    private static final Logger LOG = getLogger(Maths.class.getName());

    /**
     * sqrt(a^2 + b^2) without under/overflow. * * @param a
     *
     *
     * @param b
     * @return
     * @param a
     */
    public static Double hypot(Double a, Double b) {
        Double r;
        if (abs(a) > abs(b)) {
            r = b / a;
            r = abs(a) * sqrt(1 + r * r);
        } else if (b != 0) {
            r = a / b;
            r = abs(b) * sqrt(1 + r * r);
        } else {
            r = 0.0;
        }
        return r;
    }

    private Maths() {
    }
}
