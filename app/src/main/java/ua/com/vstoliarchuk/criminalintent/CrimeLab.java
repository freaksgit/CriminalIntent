package ua.com.vstoliarchuk.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by vstoliar on 01.06.2017.
 */
public class CrimeLab {
    private final Context mAppContext;
    private List<Crime> mCrimes;
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mAppContext = context;
        mCrimes = new ArrayList<>();
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
    public void deleteCrime(UUID id){
        mCrimes.remove(getCrime(id));
    }
}