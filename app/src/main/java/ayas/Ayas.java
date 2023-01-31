package ayas;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.*;

final public class Ayas extends FragmentActivity {
    private Context context;
    private ArrayList<String> ids = new ArrayList<>();

    public Ayas(){}
    
    public Ayas(Context context) {
        this.context = context;
    }

    public void initPage(Context context) {
        this.context = context;
    }

    public Context page() {
        return context;
    }

    public boolean hasId(String id) {
        if (ids.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    public String getLayoutId(String id) {
        return ids.get(id);
    }

    protected void onBorn() {
        Bundle v = new Bundle();
        super.onCreate(v);
    }

    public void onView() {
        super.onStart();
    }

    public void onEnd() {
        super.onDestroy();
    }

    public void onBack() {
        super.onBackPressed();
    }

    public void onContinue() {
        super.onResume();
    }
}
