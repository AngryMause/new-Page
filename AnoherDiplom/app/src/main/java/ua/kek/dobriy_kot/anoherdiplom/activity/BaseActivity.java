package ua.kek.dobriy_kot.anoherdiplom.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import ua.kek.dobriy_kot.anoherdiplom.R;

public class BaseActivity extends AppCompatActivity {
    private View container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_actyvity);
        ButterKnife.bind(this);

    }
    public void replaceFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(container.getId() ,fragment).commit();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
