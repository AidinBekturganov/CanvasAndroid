package com.example.canvaslab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyCanvas extends View {

    Paint paint;
    Rect rect;

    public MyCanvas(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1);

        canvas.drawRect(200, 200, 500, 500, paint);
        canvas.drawCircle(800, 350, 150, paint);
        canvas.drawLine(50, 600, 600, 600, paint);
        canvas.drawLine(50, 650, 600, 650, paint);
        canvas.drawLine(50, 700, 600, 700, paint);

    }
}
