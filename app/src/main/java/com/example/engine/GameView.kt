package com.example.engine

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.WindowManager
import android.widget.ScrollView
import androidx.constraintlayout.solver.Metrics
import com.example.`object`.CaseType
import com.example.`object`.Grid

class GameView (context: Context?, attrs : AttributeSet? = null, defStyleAttrs : Int = 0) : ScrollView(context, attrs, defStyleAttrs) {
    private lateinit var mPaintRect : Paint
    private var mWidthView : Int = getScreenWidth()
    private var mHeightView : Int = getScreenHeight()
    private var mWidthRectF : Int = 150
    private var mRect : Rect = Rect()
    private var mSizeCase : Int = 100

    var grid = Grid(mWidthView/mSizeCase, mHeightView/mSizeCase, mSizeCase)

    init {
        initPaints()
    }

    private fun initPaints(){
        this.mPaintRect = Paint(Paint.ANTI_ALIAS_FLAG)
        this.mPaintRect.style = Paint.Style.FILL
        this.mPaintRect.color = Color.RED
    }

    @Override
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        /*mWidthView = MeasureSpec.getSize(widthMeasureSpec)
        mHeightView = MeasureSpec.getSize(heightMeasureSpec)

        var size = Math.min(mWidthView, mHeightView)*/
        setMeasuredDimension(mWidthView, mHeightView)
    }

    @Override
    override fun onDraw(canvas: Canvas) {
        for(x in 0 until grid.width){
            for(y in 0 until grid.height){
                mRect.bottom = mWidthRectF*y + mWidthRectF
                mRect.top = mWidthRectF*y
                mRect.right = mWidthRectF*x + mWidthRectF
                mRect.left = mWidthRectF*x
                when(grid.matrixTiles[y][x]?.type){
                    CaseType.CASE_GRASS -> mPaintRect.color = Color.GREEN
                    CaseType.CASE_ROCK -> mPaintRect.color = Color.BLACK
                    CaseType.CASE_SEA -> mPaintRect.color = Color.BLUE
                    else -> mPaintRect.color = Color.RED
                }
                canvas.drawRect(mRect, mPaintRect)
            }
        }
        canvas.drawRect(mRect,mPaintRect)
        super.onDraw(canvas)
    }
}