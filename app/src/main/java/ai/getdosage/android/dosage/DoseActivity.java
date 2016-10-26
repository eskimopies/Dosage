package ai.getdosage.android.dosage;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by Eskimopies on 20/10/2016.
 */

public class DoseActivity extends SingleFragmentActivity {

    public static final String EXTRA_DOSE_ID = "ai.getdosage.android.dosage.dose_id";

    public static Intent newIntent(Context packageContext, UUID doseID) {
        Intent intent = new Intent(packageContext, DoseActivity.class);
        intent.putExtra(EXTRA_DOSE_ID, doseID);
        return intent;
    }

    public Fragment createFragment() {
        return new DoseFragment().newInstance();
    }

}
