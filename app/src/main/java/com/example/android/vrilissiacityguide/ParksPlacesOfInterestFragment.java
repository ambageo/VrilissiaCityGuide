package com.example.android.vrilissiacityguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of parks and places of interest.
 */
public class ParksPlacesOfInterestFragment extends Fragment {

    public ParksPlacesOfInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details_list, container, false);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(R.drawable.mikis_theodorakis, R.string.mikis, R.string.mikis_address));
        details.add(new Details(R.drawable.attiko_parko, R.string.attikoParko, R.string.attikoParko_address));
        details.add(new Details(R.drawable.naftiki_vasi, R.string.kallas, R.string.kallas_address));
        details.add(new Details(R.drawable.square_analipseos, R.string.analipseos, R.string.analipseos_address, R.string.analipseos_web));
        details.add(new Details(R.drawable.dimarxeio, R.string.townHall, R.string.townHall_address, R.string.townHall_tel, R.string.townHall_web));
        details.add(new Details(R.drawable.eleftherias, R.string.eleftherias, R.string.eleftherias_address));
        details.add(new Details(R.drawable.church_analipseos, R.string.analipseosChurch, R.string.analipseosChurch_address));
        details.add(new Details(R.drawable.aliki_vougiouklaki, R.string.vougiouklaki, R.string.vougiouklaki_address, R.string.vougiouklaki_tel));

        DetailsAdapter detailsAdapter = new DetailsAdapter(getActivity(), details);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // details_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link DetailsAdapter} we created above, so that the
        // {@link ListView} will display list items for each details object in the list of details.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link DetailsAdapter} with the variable name detailsAdapter.
        listView.setAdapter(detailsAdapter);

        return rootView;
    }


}
