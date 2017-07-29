package ua.kek.dobriy_kot.anoherdiplom.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Dobriy_Kot on 12.07.2017.
 */

public class BaseFragment extends Fragment {
    private static AppCompatActivity appCompatActivity;
    private static View container;
    private Unbinder unbinder;
    private DatabaseReference firebaseDatabase;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder= ButterKnife.bind(this,container);
        firebaseDatabase=FirebaseDatabase.getInstance().getReference();
    }
    public void replaceFragment(AppCompatActivity appCompatActivity,View container){
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
