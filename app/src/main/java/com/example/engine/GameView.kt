package com.example.engine

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.widget.ScrollView

class GameView (context: Context?, attrs : AttributeSet? = null, defStyleAttrs : Int = 0) : ScrollView(context, attrs, defStyleAttrs) {
    private lateinit var mPaintRect : Paint;

    private var mWidthRectF : Int = 150
    private var mRect : Rect = Rect()


    init {
        initPaints()
    }

    private fun initPaints(){
        this.mPaintRect = Paint(Paint.ANTI_ALIAS_FLAG)
        this.mPaintRect.style = Paint.Style.FILL
        this.mPaintRect.color = Color.RED
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var w = MeasureSpec.getSize(widthMeasureSpec)
        var h = MeasureSpec.getSize(heightMeasureSpec)

        var size = Math.min(w, h)
        setMeasuredDimension(size, size)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        mRect.bottom = mWidthRectF
        mRect.top = 0
        mRect.right = mWidthRectF
        mRect.left = 0
        canvas.drawRect(mRect, this.mPaintRect)
    }
}