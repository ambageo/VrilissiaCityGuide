package com.example.android.vrilissiacityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        ArrayList<Details> details = new ArrayList<Details>();


        details.add(new Details(R.drawable.barbara_que, R.string.barbaraQue, R.string.barbaraQue_address, R.string.barbaraQue_tel, R.string.barbaraQue_web));
        details.add(new Details(R.drawable.pitta_tou_pappou, R.string.pittaPappou, R.string.pittaPappou_address, R.string.pittaPappou_tel, R.string.pittaPappou_web));
        details.add(new Details(R.drawable.souvlaki_vrilission, R.string.souvlakiVrilission, R.string.souvlakiVrilission_address, R.string.souvlakiVrilission_tel, R.string.souvlakiVrilission_web));
        details.add(new Details(R.drawable.gusto_divino, R.string.gustoDivino, R.string.gustoDivino_address, R.string.gustoDivino_tel, R.string.gustoDivino_web));
        details.add(new Details(R.drawable.simply_burgers, R.string.simplyBurgers, R.string.simplyBurgers_address, R.string.simplyBurgers_tel, R.string.simplyBurgers_web));
        details.add(new Details(R.drawable.mammoth, R.string.mammoth, R.string.mammoth_address, R.string.mammoth_tel, R.string.mammoth_web));

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
