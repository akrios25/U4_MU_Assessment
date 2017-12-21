package nyc.c4q.fragassessment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by c4q on 12/20/17.
 */

public class TopFragment extends Fragment {
    View rootview;

    public TopFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       rootview = inflater.inflate(R.layout.top_fragment_layout, container, false);
        TopFragment topFragment = new TopFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.top_fragment_view, topFragment);
        fragmentTransaction.commit();

        return rootview;
    }
}
