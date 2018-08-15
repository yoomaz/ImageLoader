package com.yooma.imageloader.loader;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.io.File;

public interface ILoader {

    ILoader with(Context context);

    ILoader with(Fragment fragment);

    ILoader placeHolder(int id);

    ILoader error(int id);

    ILoader dontAnimate();

    ILoader dontTransform();

    ILoader override(int width, int height);

    ILoader centerCrop();

    ILoader centerInside();

    ILoader fitCenter();

    ILoader asGif();

    ILoader asBitmap();

    ILoader load(String url);

    ILoader load(Uri uri);

    ILoader load(File file);

    ILoader load(Integer resourceId);

    ILoader thumbnail(float size);

    ILoader listener(RequestListener listener);

    ILoader argb8888();

    void pauseRequests();

    void resumeRequests();

    void into(ImageView imageView);

}
