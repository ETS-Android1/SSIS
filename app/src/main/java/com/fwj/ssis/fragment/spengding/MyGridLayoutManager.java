/*
 * Copyright(c)2019-
 *    项目名称:SSIS
 *    文件名称:MyGridLayoutManager.java
 *    Date:19-6-4 下午12:26
 *    Author:Fanwj
 */

package com.fwj.ssis.fragment.spengding;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by yuukidach on 17-3-19.
 */

public class MyGridLayoutManager extends GridLayoutManager {
    private static final String TAG = "MyGridLayoutManager";
    
    public MyGridLayoutManager(Context context, AttributeSet attrs,
                               int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public MyGridLayoutManager(Context context, int spanCount){
        super(context, spanCount);
    }

    public MyGridLayoutManager(Context context, int spanCount,
                               int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    @Override
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec) {
        setMeasuredDimension(widthSpec, heightSpec);
        Log.d(TAG, "onMeasure: ");
    }
}
