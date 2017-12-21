package nyc.c4q.fragassessment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by c4q on 12/20/17.
 */

public class MainFragment extends Fragment {
    View rootView;

    public MainFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.mf_layout, container, false);
        return rootView;
    }

}
