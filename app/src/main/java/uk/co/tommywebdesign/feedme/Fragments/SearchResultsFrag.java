package uk.co.tommywebdesign.feedme.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.tommywebdesign.feedme.R;

/**
 * Created by tommy on 16/10/16.
 */

public class SearchResultsFrag  extends Fragment {

    private int fragXmlLayout = R.layout.fragment_blank; //TODO changeLayout



    public SearchResultsFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.search_result_frag_layout, container, false);
    }
}