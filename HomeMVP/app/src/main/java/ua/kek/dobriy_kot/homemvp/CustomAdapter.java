package ua.kek.dobriy_kot.homemvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dobriy_Kot on 16.07.2017.
 */

public class CustomAdapter extends BaseAdapter {
    private List<String> examoleLisr = new ArrayList<>();
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context) {
        this.context = context;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        for (int i = 0; i < 5; i++) {
            examoleLisr.add(" List " + i);
        }
    }

    @Override
    public int getCount() {
        return examoleLisr.size();
    }

    @Override
    public Object getItem(int i) {
        return examoleLisr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(R.layout.style_adapter,null);
        final TextView textView = view.findViewById(R.id.exampleTextView);
        textView.setText(examoleLisr.get(i));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity )context).getPresenterImp().showAlert(examoleLisr.get(i));

            }
        });
        return view;
    }

}
