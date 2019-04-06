package de.projects.janap.a03_kalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Calendar;

public abstract class Kalender_Adapter extends BaseAdapter {

    protected Context context;
    protected int[] tage;
    protected int datum;


    public Kalender_Adapter(Context pContext, int[] pTage){
        this.context = pContext;
        this.tage = pTage;

    }

    @Override
    public int getCount() {
        return tage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
