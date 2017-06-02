package ua.com.vstoliarchuk.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by vstoliar on 01.06.2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
