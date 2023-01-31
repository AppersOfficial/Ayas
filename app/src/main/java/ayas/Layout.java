package ayas;

import android.widget.LinearLayout;
import ayas.except.IdentException;
import java.util.*;

public class Layout {

    private Ayas ayas;

    private String id;
    public static final int VIEW_GONE = 8;
    public static final int CENTER = 17;
    public static final int CENTER_HORIZONTAL = 1;
    public static final int CENTER_VERTICAL = 16;
    public static final int LEFT = 3;
    public static final int RIGHT = 5;
    public static final int BOTTOM = 80;
    public static final int TOP = 48;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int MATCH = -1;
    public static final int WRAP = -2;
    public static final int WHITE = 0xFFFFFF;
    public static final int BLACK = 0x000000;
    public static final int BLUE = 0x0000FF;
    public static final int RED = 0xFF0000;
    public static final int GREEN = 0x00FF00;
    public static final int YELLOW = 0xFFFF00;
    public static final int GREY = 0xCDCDCD;
    public static final int BROWN = 0xFFFFFF;
    public static final int PURPLE = 0xFFFFFF;
    public static final int TRANSPARENT = 0x00000000;

    public Layout(){}
    
    public Layout(int width, int height, int orientation, int color, int gravity) {
        LinearLayout layout = new LinearLayout(ayas.getApplicationContext());
        layout.setLayoutParams(new LinearLayout.LayoutParams(width, height));
        layout.setOrientation(orientation);
        layout.setBackgroundColor(color);
        layout.setGravity(gravity);
    }
}
