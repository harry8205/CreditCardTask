package com.example.creditcardtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CountriesAdopter extends ArrayAdapter<Countries> {

    public CountriesAdopter(@NonNull Context context, ArrayList<Countries>countryList) {
        super(context, 0, countryList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return countryView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return countryView(position, convertView, parent);
    }
    public View countryView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.country_spinner,parent,false);
        }
        Countries items=getItem(position);
        ImageView spinnerImage=convertView.findViewById(R.id.iv_flag);
        TextView spinnertext=convertView.findViewById(R.id.tv_country);
        if (items !=null)
        {
            spinnerImage.setImageResource(items.getFlagImage());
            spinnertext.setText(items.getCountryName());
        }
        return convertView;
    }
}
