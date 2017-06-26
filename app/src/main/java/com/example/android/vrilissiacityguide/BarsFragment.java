package com.example.android.vrilissiacityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.example.android.vrilissiacityguide.DetailsAdapter;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of bars.
 */
public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(R.drawable.volstead, R.string.volstead, R.string.volstead_address, R.string.volstead_tel, R.string.volstead_web));
        details.add(new Details(R.drawable.cibo, R.string.cibo, R.string.cibo_address, R.string.cibo_tel, R.string.cibo_web));
        details.add(new Details(R.drawable.homemade, R.string.homemade, R.string.homemade_address, R.string.homemade_tel, R.string.homemade_web));
        details.add(new Details(R.drawable.thirty_three,R.string.thirtyThree, R.string.thirtyThree_address, R.string.thirtyThree_tel, R.string.thirtyThree_web));
        details.add(new Details(R.drawable.lazy, R.string.lazy, R.string.lazy_address, R.string.lazy_tel, R.string.lazy_web));
        details.add(new Details(R.drawable.barbara_que, R.string.barbaraQue, R.string.barbaraQue_address, R.string.barbaraQue_tel, R.string.barbaraQue_web));


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
