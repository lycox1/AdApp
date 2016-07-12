package com.e4deen.adapp.listview;
import android.graphics.drawable.Drawable;

/**
 * Created by sangwon4.lee on 2016-07-12.
 */
public class ListViewItemForNavView {
    private Drawable iconDrawable;
    private String titleStr;
    private Drawable iconDrawable2;

    public void setIcon(Drawable drawable) {
        //drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        iconDrawable = drawable ;
    }

    public void setIcon2(Drawable drawable) {
        iconDrawable2 = drawable ;
    }

    public Drawable getIcon() {
        this.iconDrawable.setBounds(5, 5, 100, 100);
        return this.iconDrawable ;
    }
    public Drawable getIcon2() {
        this.iconDrawable2.setBounds(5, 5, 100, 100);
        return this.iconDrawable2;
    }

    public void setTitle(String title) {
        titleStr = title ;
    }

    public String getTitle() {
        return this.titleStr ;
    }
}