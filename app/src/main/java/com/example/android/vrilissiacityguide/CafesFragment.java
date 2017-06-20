package com.example.android.vrilissiacityguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.android.vrilissiacityguide.R;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of cafes.
 */
public class CafesFragment extends Fragment {


    public CafesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(R.drawable.pantony, R.string.pantony, R.string.pantony_address, R.string.pantony_tel));
        details.add(new Details(R.drawable.elli_tou_klou, R.string.eliTouKlou, R.string.eliTouKlou_address, R.string.eliTouKlou_tel));
        details.add(new Details(R.drawable.zentil, R.string.zentil, R.string.zentil_address, R.string.zentil_tel));
        details.add(new Details(R.drawable.coffee_lab, R.string.coffeeLab, R.string.coffeeLab_address, R.string.coffeeLab_tel));
        details.add(new Details(R.drawable.hudson, R.string.hudson, R.string.hobbs_address, R.string.hudson_tel));
        details.add(new Details(R.drawable.hole, R.string.hole, R.string.hole_address,R.string.hole_tel));
        details.add(new Details(R.drawable.hobbs, R.string.hobbs, R.string.hobbs_address, R.string.hobbs_tel));
        details.add(new Details(R.drawable.mikel, R.string.mikel,R.string.mikel_address,R.string.mikel_tel));

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
