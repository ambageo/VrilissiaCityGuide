package com.example.android.vrilissiacityguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by georgeampartzidis on 11/6/17.
 * {@link} DetailsAdapter is an {@link} ArrayAdapter that provides the layout for each list
 * based on a data source, which is a list of {@link} Details objects.
 */

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Activity context, ArrayList<Details> details) {
        //Here we initialize the ArrayAdapter's internal storage for the context and the list. We are
        // doing so by calling the superclass constructor. The second argument is used when the Adapter
        // generates a single TextView. Because we are writing our customized constructor, the
        // constructor will not use the second argument, so it can be any value, for example 0.
        super(context, 0, details);

    }


    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // get the data item associated with the specified position
        final Details currentDetail = getItem(position);

        //find the ImageView in the list_view.xml and set the ImageView to the image resource
        //specified in the details
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentDetail.hasImage()) {
            imageView.setImageResource(currentDetail.getResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        //otherwise hide the imageView
        else imageView.setVisibility(View.GONE);

        //get the name od the specific details and set it on the nameTextView
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentDetail.getName());

        //get the address of the specific details and set it om the addressTextView
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentDetail.getAddress());


        //get the telephone number of the specific details and set it on the telNumberTextView
        TextView telNumberTextView = (TextView) listItemView.findViewById(R.id.telephone);

        if (currentDetail.hasPhone()) {
            telNumberTextView.setText(String.valueOf(currentDetail.getTelNumber()));
            telNumberTextView.setVisibility(View.VISIBLE);
        } else telNumberTextView.setVisibility(View.GONE);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (String.valueOf(currentDetail.getWebAddress()) != null) {
                    Uri webPage = Uri.parse(String.valueOf(currentDetail.getWebAddress()));
                    Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
                        v.getContext().startActivity(intent);
                    }
                }

        });
        return listItemView;
    }


}
