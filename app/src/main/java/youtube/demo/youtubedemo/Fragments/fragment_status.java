package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.Int2;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import youtube.demo.youtubedemo.R;

public class fragment_status extends Fragment {

    Integer bmiw,bmih,bmi,bmia,bmiv;
    Double bmrcal;
    String bmivalue,bmitips,bmrvalue;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        String fillage = sharedPref.getString("age","");
        String fillsex = sharedPref.getString("sex","");
        String fillweight = sharedPref.getString("weight","");
        String fillheight = sharedPref.getString("height","");


        bmia = Integer.parseInt(fillage);
        bmiw = Integer.parseInt(fillweight);
        bmih = Integer.parseInt(fillheight);
        bmi = bmiw/(bmih*bmih/10000);
        bmrcal = 66+(13.8*bmiw)+(5*bmih)-(6.8*bmia);
        bmiv = (int)Math.floor(bmrcal);
        bmrvalue = String.valueOf(bmrcal);





        if(bmi<=18.5)
        {
            bmivalue = "Underweight";
            bmitips = "You need to gain your weight";

        }else if(bmi>=18.5 && bmi<=24.9)
        {
            bmivalue = "Normal weight";
            bmitips = "Maintain your weight";

        }else if(bmi>=25 && bmi<=30)
        {
            bmivalue = "Overweight";
            bmitips = "Walk daily to loos your weight";

        }else if(bmi>=30 && bmi<=35)
        {
            bmivalue = "Obese Class 1";
            bmitips = "Walk & eat low calorie food";

        }else if(bmi>=35 && bmi<=40)
        {
            bmivalue = "Obese Class 2";
            bmitips = "Daily go to GYM ";

        }else if(bmi>40) {
            bmivalue = "Obese Class 3";
            bmivalue = "Take advice from Doctor";
        }


        TextView textView5 = (TextView) view.findViewById(R.id.textView5);
        textView5.setText(String.valueOf(bmi));
        TextView textView6 = (TextView) view.findViewById(R.id.textView6);
        textView6.setText(bmivalue);
        TextView textView7 = (TextView) view.findViewById(R.id.bmitips);
        textView7.setText(bmitips);
        TextView textView17 = (TextView) view.findViewById(R.id.textView17);
        textView17.setText(bmrvalue);

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putFloat("bmi",bmi);
        editor.apply();
        Toast.makeText(getActivity(),"BMI Saved",Toast.LENGTH_LONG).show();


        return view;
    }
}
