package bistu.rookie.u_nity.androidproject_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import bistu.rookie.u_nity.androidproject_12.Words.WordsContent;

public class MainActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener, DetailFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(WordsContent.WordItem item) {
        Bundle arguments = new Bundle();
        arguments.putString("id", item.id);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.WordDetail, fragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
