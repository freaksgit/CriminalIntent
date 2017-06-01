package ua.com.vstoliarchuk.criminalintent;

import java.util.UUID;

/**
 * Created by vstoliar on 01.06.2017.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }
}
