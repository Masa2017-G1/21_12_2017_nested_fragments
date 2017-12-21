package com.sheygam.masa_2017_21_12_nested_fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private MainFragmentListener listener;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (MainFragmentListener) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button showViewPagerBtn = view.findViewById(R.id.show_viewpager_btn);
        showViewPagerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClickButtonNext();
            }
        });
    }

    public interface MainFragmentListener{
        void onClickButtonNext();
    }

}
