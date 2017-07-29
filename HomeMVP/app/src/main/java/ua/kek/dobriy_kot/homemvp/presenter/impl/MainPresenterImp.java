package ua.kek.dobriy_kot.homemvp.presenter.impl;

import android.content.Context;

import ua.kek.dobriy_kot.homemvp.MainView;
import ua.kek.dobriy_kot.homemvp.model.AletrModel;
import ua.kek.dobriy_kot.homemvp.model.Model;
import ua.kek.dobriy_kot.homemvp.presenter.BasePresenter;

/**
 * Created by Dobriy_Kot on 16.07.2017.
 */

public class MainPresenterImp implements BasePresenter {
    private Model model;
    private MainView mainView;
    private AletrModel aletrModel;


    public MainPresenterImp(MainView mainView) {
        this.mainView=mainView;
        this.model = new Model();
        this.aletrModel=new AletrModel();
    }

    @Override
    public void presButton(String s) {
        model.addText(s);
        mainView.showText(model.getString());
    }

    @Override
    public void showAlert(String string) {
        aletrModel.showAlert((Context) mainView,string);
    }
}
