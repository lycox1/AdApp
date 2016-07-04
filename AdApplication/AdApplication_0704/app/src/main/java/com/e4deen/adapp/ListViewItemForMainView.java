package com.e4deen.adapp;

import android.graphics.drawable.Drawable;

/**
 * Created by user on 2016-07-04.
 */
public class ListViewItemForMainView {
    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;

    public void setIcon(Drawable drawable) {
        //drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());

        iconDrawable = drawable ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }

    public Drawable getIcon() {
        this.iconDrawable.setBounds(5, 5, 100, 100);
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }
}