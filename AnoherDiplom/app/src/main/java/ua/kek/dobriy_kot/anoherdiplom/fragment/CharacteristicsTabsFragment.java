package ua.kek.dobriy_kot.anoherdiplom.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.kek.dobriy_kot.anoherdiplom.R;

/**
 * Created by Dobriy_Kot on 17.07.2017.
 */

public class CharacteristicsTabsFragment extends BaseFragment {
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fargment_characteristics_tabs,container,false);
    }
}
