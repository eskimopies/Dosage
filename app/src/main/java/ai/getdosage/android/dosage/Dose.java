package ai.getdosage.android.dosage;

import android.widget.TextView;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Eskimopies on 20/10/2016.
 */

public class Dose {

    private UUID mId;
    private Date mTime;
    private String mLocation;
    private String mTitle;
    private String mDuration;

    public Dose() {
        mId = UUID.randomUUID();
    }

    public Dose(UUID id) {
        mId = id;
    }

    public UUID getId() {
        return mId;
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date time) {
        mTime = time;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        mDuration = duration;
    }
}
