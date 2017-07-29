package ua.kek.dobriy_kot.diplomwork.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import ua.kek.dobriy_kot.diplomwork.R;
import ua.kek.dobriy_kot.diplomwork.models.ShopModel;

public class CustomAdapterShop extends BaseAdapter {
    private LayoutInflater inflater;
    private List<ShopModel> shopModels;
    private Context context;

    public CustomAdapterShop(List<ShopModel> shopModels, Context context) {
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.shopModels = shopModels;

    }

    @Override
    public int getCount() {
        return shopModels.size();
    }

    @Override
    public Object getItem(int position) {
        return shopModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.stayle_shop,parent,false);
        ((TextView)  convertView.findViewById(R.id.shopLogo)).setText(shopModels.get(position).getNameShop());
        ((TextView) convertView.findViewById(R.id.priceInThisShop)).setText((int) shopModels.get(position).getPrice());
        ((TextView)convertView.findViewById(R.id.linkForThisShop)).setText(shopModels.get(position).getLinkShop());
        return convertView;
    }

}
