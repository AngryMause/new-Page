package ua.kek.dobriy_kot.anoherdiplom.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import butterknife.BindView;
import ua.kek.dobriy_kot.anoherdiplom.R;
import ua.kek.dobriy_kot.anoherdiplom.adapter.CategoryAdapter;
import ua.kek.dobriy_kot.anoherdiplom.fragment.CategoryFragment;

public class CategoryActivity extends BaseActivity {
    private CategoryAdapter categoryAdapter;
    @BindView(R.id.category_container)
    LinearLayout categoryContainer;
    private CategoryFragment categoryFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
//        if (categoryAdapter==null){
//            categoryAdapter=new CategoryAdapter(this);
//        }
//        categoryFragment.replaceFragment(categoryFragment);
    }


}
