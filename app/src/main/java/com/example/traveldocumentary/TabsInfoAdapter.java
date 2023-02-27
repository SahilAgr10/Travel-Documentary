package com.example.traveldocumentary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class TabsInfoAdapter extends ArrayAdapter<TabsInfo> {

    public TabsInfoAdapter(Context context, ArrayList<TabsInfo> tabs){
        super(context,0,tabs);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tabslayout, parent, false);
        }
        TabsInfo currentTab = getItem(position);

        TextView place = (TextView) listItemView.findViewById(R.id.place);
        place.setText(currentTab.getCityPlace());

        TextView dateVisted = (TextView) listItemView.findViewById(R.id.date);
        place.setText(currentTab.getCityPlace());

        TextView imageId = (TextView) listItemView.findViewById(R.id.imageId);
        imageId.setText(currentTab.getImageID());

        return listItemView;
    }

}
