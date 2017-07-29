package ua.kek.dobriy_kot.diplomwork.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.firebase.database.DatabaseReference;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class BaseFragment extends Fragment {
    private Unbinder unbinder;
    private static AppCompatActivity appCompatActivity;
    private static View container;
    private static DatabaseReference mDatabase;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        unbinder= ButterKnife.bind(this,view);
        super.onViewCreated(view, savedInstanceState);

    }
    public void replaceFragmnet(AppCompatActivity appCompatActivity,View container){
        BaseFragment.appCompatActivity =appCompatActivity;
        BaseFragment.container =container;
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(container.getId(),this).commit();
    }
    public void replaceFragment(Fragment fragment){
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(container.getId(),fragment).commit();
    }



    @Override
    public void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
