package ua.kek.dobriy_kot.homemvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.kek.dobriy_kot.homemvp.presenter.impl.MainPresenterImp;

public class MainActivity extends AppCompatActivity implements MainView {
    @BindView(R.id.mainTextView)
    TextView mainTextView;

    @BindView(R.id.stringList)
    ListView stringList;

    private MainPresenterImp presenterImp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (presenterImp==null) {
            presenterImp = new MainPresenterImp(this);
        }
        stringList.setAdapter(new CustomAdapter(this));
    }
    public MainPresenterImp getPresenterImp() {
        return presenterImp;
    }

    @Override
    public void showText(String s) {
        mainTextView.setText(s);
    }

}
