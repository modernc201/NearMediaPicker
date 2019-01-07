package com.moderncreation.mediapickerlibrary.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.moderncreation.mediapickerlibrary.R;


/**
 * Display thumbnail of video, photo and state when video, photo selected or
 * not.
 */
public class PickerImageView extends android.support.v7.widget.AppCompatImageView {
    private Paint paintBorder;

    private boolean isSelected;
    private int borderSize = 1;
    private int a, r, g, b;
    private int index;

    public PickerImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PickerImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paintBorder = new Paint();
        paintBorder.setAntiAlias(true);
        paintBorder.setARGB(a,r,g,b);
        borderSize = getResources().getDimensionPixelSize(
                R.dimen.picker_border_size);
    }

    public PickerImageView(Context context) {
        super(context);
        init();
    }

    public void setBorderColor(int a,int r,int g,int b){
        this.a = a;
        this.r = r;
        this.g = g;
        this.b = b;
        paintBorder.setARGB(a,r,g,b);
    }

    public void setBorderColor(int borderColor){
        paintBorder.setColor(borderColor);
    }

    public void setSelected(boolean isSelected) {
        if (isSelected != this.isSelected) {
            this.isSelected = isSelected;
            invalidate();
        }
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected) {
            canvas.drawRect(0, 0, borderSize, getHeight(), paintBorder);
            canvas.drawRect(getWidth() - borderSize, 0, getWidth(),
                    getHeight(), paintBorder);
            canvas.drawRect(0, 0, getWidth(), borderSize, paintBorder);
            canvas.drawRect(0, getHeight() - borderSize, getWidth(),
                    getHeight(), paintBorder);
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}