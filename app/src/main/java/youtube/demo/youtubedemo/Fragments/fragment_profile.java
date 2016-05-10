package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import youtube.demo.youtubedemo.R;

public class fragment_profile extends Fragment {

    EditText age,sex,weight,height,gpre,gpost,upre,upost;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        String fillage = sharedPref.getString("age","");
        String fillsex = sharedPref.getString("sex","");
        String fillweight = sharedPref.getString("weight","");
        String fillheight = sharedPref.getString("height","");
        String fillgpre = sharedPref.getString("gpre","");
        String fillgpost = sharedPref.getString("gpost","");
        String fillupre = sharedPref.getString("upre","");
        String fillupost = sharedPref.getString("upost","");

        EditText edtTextage = (EditText) view.findViewById(R.id.age);
        age = edtTextage;
        edtTextage.setText(fillage);
        EditText edtTextsex = (EditText) view.findViewById(R.id.sex);
        sex = edtTextsex;
        edtTextsex.setText(fillsex);
        EditText edtTextweight = (EditText) view.findViewById(R.id.weight);
        weight = edtTextweight;
        edtTextweight.setText(fillweight);
        EditText edtTextheight = (EditText) view.findViewById(R.id.height);
        height = edtTextheight;
        edtTextheight.setText(fillheight);
        EditText edtTextgpre = (EditText) view.findViewById(R.id.gpre);
        gpre = edtTextgpre;
        edtTextgpre.setText(fillgpre);
        EditText edtTextgpost = (EditText) view.findViewById(R.id.gpost);
        gpost = edtTextgpost;
        edtTextgpost.setText(fillgpost);
        EditText edtTextupre = (EditText) view.findViewById(R.id.upre);
        upre = edtTextupre;
        edtTextupre.setText(fillupre);
        EditText edtTextupost = (EditText) view.findViewById(R.id.upost);
        upost = edtTextupost;
        edtTextupost.setText(fillupost);


       /*

        age = (EditText) view.findViewById(R.id.age);
        sex = (EditText) view.findViewById(R.id.sex);
        weight = (EditText) view.findViewById(R.id.weight);
        height = (EditText) view.findViewById(R.id.height);
        gpre = (EditText) view.findViewById(R.id.gpre);
        gpost = (EditText) view.findViewById(R.id.gpost);
        upre = (EditText) view.findViewById(R.id.upre);
        upost = (EditText) view.findViewById(R.id.upost);

*/
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPref.edit();

                editor.putString("age",age.getText().toString());
                editor.putString("sex",sex.getText().toString());
                editor.putString("weight",weight.getText().toString());
                editor.putString("height",height.getText().toString());
                editor.putString("gpre",gpre.getText().toString());
                editor.putString("gpost",gpost.getText().toString());
                editor.putString("upre",upre.getText().toString());
                editor.putString("upost",upost.getText().toString());




                editor.apply();
                Toast.makeText(getActivity(),"Profile Saved",Toast.LENGTH_LONG).show();
            }
        });

        Button button2 = (Button) view.findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new fragment_proba()).commit();


            }
        });

        return view;
    }







}
