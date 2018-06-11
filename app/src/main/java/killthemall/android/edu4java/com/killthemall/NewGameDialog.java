package killthemall.android.edu4java.com.killthemall;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by Asia on 07.06.2018.
 */

public class NewGameDialog extends DialogFragment {
    public Dialog onCreateDialog(Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Czy chcesz rozpocząć nową grę?")
                .setPositiveButton("Tak", (dialog, id) -> {getActivity().recreate();})
                .setNegativeButton("Nie", (dialog, id) -> {getActivity().finish();});
        return builder.create();
    }
}
