package shudu01.useclass.org.shudu01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
public class MyView extends View{

    public MyView(Context context) {
        super(context);
    }
    //当ANdroid系统需要绘制一个View对象时，就会调用该对象对onDraw
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        canvas.drawLine(0,0,200,200,paint);
        super.onDraw(canvas);
    }
}
