package Abdul.com.moveIt;

import android.app.Activity;
import android.content.Context;

public class Move {

    public static void leftToRight(Context context){
        ((Activity)context) .overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);

    }

}
