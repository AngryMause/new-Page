package ua.kek.dobriy_kot.homemvp.model;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import ua.kek.dobriy_kot.homemvp.MainActivity;
import ua.kek.dobriy_kot.homemvp.R;

/**
 * Created by Dobriy_Kot on 17.07.2017.
 */

public class AletrModel {
    private AlertDialog alertDialog;

    public void showAlert(final Context context, final String text){
       alertDialog=new AlertDialog.Builder(context).setMessage(R.string.sure)
//               .setTitle("Send Text")
//               .setIcon(R.drawable.ic_send_black_24dp)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity)context).getPresenterImp().presButton(text);

                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
        alertDialog.show();
    }
}
