package com.sheygam.masa_2017_21_12_nested_fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {


    private String title;

    public static PageFragment newInstance(int pageCount){
        PageFragment fragment = new PageFragment();
        fragment.title = "Page " + pageCount;
        return fragment;
    }
    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView titleTxt = view.findViewById(R.id.title_txt);
        titleTxt.setText(title);
    }
}
