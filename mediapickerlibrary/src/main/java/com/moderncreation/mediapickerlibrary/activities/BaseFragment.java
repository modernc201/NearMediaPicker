package com.moderncreation.mediapickerlibrary.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.moderncreation.mediapickerlibrary.imageloader.MediaImageLoader;

public class BaseFragment extends Fragment {
    protected Context mContext;
    protected MediaImageLoader mMediaImageLoader;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentHost host = (FragmentHost) context;
        mMediaImageLoader = host.getImageLoader();
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = getActivity();
    }
}
