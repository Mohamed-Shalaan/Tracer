package com.example.tracer;

import android.content.Context;
import android.content.res.Configuration;

public class LocalConfig {
    public static Context adjustFontSize(Context context){
        Configuration configuration = context.getResources().getConfiguration();
        // This will apply to all text like -> Your given text size * fontScale
        configuration.fontScale = 1.3f;

        return context.createConfigurationContext(configuration);
    }
}
