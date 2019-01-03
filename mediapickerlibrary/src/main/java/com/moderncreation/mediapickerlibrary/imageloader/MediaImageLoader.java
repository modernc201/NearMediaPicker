package com.moderncreation.mediapickerlibrary.imageloader;

import android.net.Uri;
import android.widget.ImageView;


public interface MediaImageLoader {
    void displayImage(Uri uri, ImageView imageView);
}
