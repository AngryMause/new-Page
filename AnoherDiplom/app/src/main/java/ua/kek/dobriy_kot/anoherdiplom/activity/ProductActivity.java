package ua.kek.dobriy_kot.anoherdiplom.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import ua.kek.dobriy_kot.anoherdiplom.R;

public class ProductActivity extends BaseActivity {

    private TabLayout tabLayout;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
}
