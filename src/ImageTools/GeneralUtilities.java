package ImageTools;

/**
 * Created by sam on 12/9/14.
 */
public class GeneralUtilities {

    /**
     * Default constructor
     */
    public GeneralUtilities() { }

    /**
     * Returns <code>int color</code> error trapped for RGB
     * color values (ranged from 0 to 255 inclusive).
     *
     * @param color int value to error trap
     *
     * @return 0 if <code>int color</code> < 0; 255 if
     * <code>int color</code> > 255; <code>int color</code>
     * if 0 < <code>int color</code> < 255
     */
    public static int colorRangeTrap(int color) {
        if (color < 0) {
            return 0;
        } else if (color > 255) {
            return 255;
        } else {
            return color;
        }
    }

}
