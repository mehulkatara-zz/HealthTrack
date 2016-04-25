package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import youtube.demo.youtubedemo.R;

public class fragment_probability extends Fragment {

    float bmiw,bmih,bmi;
    String bmivalue;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_probability, container, false);

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        String fillage = sharedPref.getString("age","");
        String fillsex = sharedPref.getString("sex","");
        String fillweight = sharedPref.getString("weight","");
        String fillheight = sharedPref.getString("height","");

        bmiw = Float.parseFloat(fillweight);
        bmih = Float.parseFloat(fillheight);
        bmi = bmiw/(bmih*bmih);

        if(bmi<=18.5)
        {
            bmivalue = "Underweight";

        }else if(bmi>=18.5 && bmi<=24.9)
        {
            bmivalue = "Normal weight";

        }else if(bmi>=25 && bmi<=19.9)
        {
            bmivalue = "Overweight";

        }else if(bmi>=30)
        {
            bmivalue = "Obese";

        }


        TextView textView5 = (TextView) view.findViewById(R.id.textView5);
        textView5.setText(String.valueOf(bmi));
        TextView textView6 = (TextView) view.findViewById(R.id.textView6);
        textView6.setText(bmivalue);

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putFloat("bmi",bmi);
        editor.apply();
        Toast.makeText(getActivity(),"BMI Saved",Toast.LENGTH_LONG).show();


        return view;
    }
}
