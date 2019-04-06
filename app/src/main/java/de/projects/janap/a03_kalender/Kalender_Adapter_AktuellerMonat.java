package de.projects.janap.a03_kalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Kalender_Adapter_AktuellerMonat extends Kalender_Adapter {



    public Kalender_Adapter_AktuellerMonat(Context pContext, int[] pTage) {
        super(pContext, pTage);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.zelle_aktueller_monat_aktuell, null);
        }

        datum = position+1;
        TextView textViewTag = convertView.findViewById(R.id.textview_tag);
        textViewTag.setText(""+datum);


        return convertView;
    }
}
