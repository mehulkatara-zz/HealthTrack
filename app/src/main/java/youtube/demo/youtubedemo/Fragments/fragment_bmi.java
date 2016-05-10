package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import youtube.demo.youtubedemo.R;

public class fragment_bmi extends Fragment {

    String print;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bmi, container, false);
        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        Integer mybmi = sharedPref.getInt("bmi",0);


       if (mybmi<25)
        {
            print = "Medium Risk";
        }
        else if (mybmi>=25)
       {
           print = "High Risk";
       }

        TextView textView2 = (TextView) view.findViewById(R.id.textView2);
        textView2.setText(print);


        return view;
    }
}
