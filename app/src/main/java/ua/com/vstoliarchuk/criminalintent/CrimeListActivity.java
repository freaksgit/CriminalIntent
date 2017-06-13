package ua.com.vstoliarchuk.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;


/**
 * Created by vstoliar on 01.06.2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    public static final String EXTRA_CHANGED_CRIME_ID = "ua.com.vstoliarchuk.criminalintent.changed_crime_position";
    @Override
    protected Fragment createFragment() {
        int position = getIntent().getIntExtra(EXTRA_CHANGED_CRIME_ID, 0);
        return CrimeListFragment.newInstance(position);
    }
    public static Intent newIntent(Context packageContext, int position){
        Intent intent = new Intent(packageContext, CrimeListActivity.class);
        intent.putExtra(EXTRA_CHANGED_CRIME_ID, position);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }
}
