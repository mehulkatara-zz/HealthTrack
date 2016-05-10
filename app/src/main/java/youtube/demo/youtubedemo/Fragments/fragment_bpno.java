package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import youtube.demo.youtubedemo.R;

public class fragment_bpno extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bpno, container, false);


        Button yes = (Button) view.findViewById(R.id.button2);
        Button no = (Button) view.findViewById(R.id.button4);

        yes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new fragment_exeyes()).commit();


            }

        });

        no.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new fragment_smoke()).commit();


            }

        });



        return view;
    }
}
