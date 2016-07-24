package shudu01.useclass.org.shudu01;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
public class MyView2 extends View{
    public MyView2(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setARGB(150,0,100,200);
        //设置为空心
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setTextSize(100);


        canvas.drawText("apple",50,200,paint);
       canvas.drawLine(0,200,500,200,paint);

        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher),100,300,paint);
       /* canvas.drawRect(100,300,300,500,paint);
        //设置为实心
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200,200,150,paint);*/
        super.onDraw(canvas);
    }
}
