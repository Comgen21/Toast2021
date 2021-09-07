package com.comgen.poc.toastyboy;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void customToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
