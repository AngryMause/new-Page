package ua.kek.dobriy_kot.diplomwork.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import ua.kek.dobriy_kot.diplomwork.R;
import ua.kek.dobriy_kot.diplomwork.customadapter.MenuProductAdapter;
import ua.kek.dobriy_kot.diplomwork.fragment.ProductDescriptionFragent;
import ua.kek.dobriy_kot.diplomwork.fragment.ShopFragment;

public class ProductActivity extends AppCompatActivity {
    @BindView(R.id.tabsLayout)
     TabLayout tabLayout;
    @BindView(R.id.viewpager)
     ViewPager viewPager;
    private MenuProductAdapter menuProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        menuProductAdapter = new MenuProductAdapter(getSupportFragmentManager());
        menuProductAdapter.addFragment(new ProductDescriptionFragent(), "Product Description");
        menuProductAdapter.addFragment(new ShopFragment(), "Shop");
        viewPager.setAdapter(menuProductAdapter);
    }
}
