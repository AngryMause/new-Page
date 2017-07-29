package ua.kek.dobriy_kot.anoherdiplom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dobriy_Kot on 29.07.2017.
 */

public class CategoryAdapter extends BaseAdapter {
    private List<String> listCategory=new ArrayList<>();
    private LayoutInflater layoutInflater;
    private Context context;

    public CategoryAdapter(Context context) {
        this.context = context;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        for (int i = 0; i <15 ; i++) {
            listCategory.add("Category: "+i);

        }
    }


    @Override
    public int getCount() {
        return listCategory.size();
    }

    @Override
    public Object getItem(int i) {
        return listCategory.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(android.R.layout.simple_list_item_1,null);
        TextView textView=view.findViewById(android.R.id.text1);
        textView.setText(listCategory.get(i));
        return view;
    }
}
