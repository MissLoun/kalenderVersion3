package de.projects.janap.a03_kalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;

public class Kalender_Adapter_LetzterMonat extends Kalender_Adapter {

    private Calendar kalender = Calendar.getInstance();
    private int datum = kalender.getActualMaximum(Calendar.DAY_OF_MONTH)-kalender.get(Calendar.DAY_OF_WEEK)-1;


    public Kalender_Adapter_LetzterMonat(Context pContext, int[] pTage) {
        super(pContext, pTage);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.zelle_aktueller_monat_aktuell, null);
        }

        TextView textViewTag = convertView.findViewById(R.id.textview_tag);
        textViewTag.setText(""+datum);
        datum++;

        return convertView;
    }
}
