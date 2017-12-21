package nyc.c4q.fragassessment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by c4q on 12/20/17.
 */

public class MainFragment extends Fragment {
    View rootView;
    Button df_button;

    public MainFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.mf_layout, container, false);


        Button df_button =  rootView.findViewById(R.id.mf_button);
        df_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainFragment mainFragment = new MainFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.df_layout, mainFragment).addToBackStack("display fragment");
                fragmentTransaction.commit();
            }
        });
        return rootView;
    }

}
