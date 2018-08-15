package com.yooma.imageloader.loader;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import java.io.File;

public class GlideLoader implements ILoader {

    private RequestManager requestManager;
    private RequestBuilder requestBuilder;
    private RequestOptions requestOptions = new RequestOptions();

    @Override
    public ILoader with(Context context) {
        requestManager = Glide.with(context);
        return this;
    }

    @Override
    public ILoader with(Fragment fragment) {
        requestManager = Glide.with(fragment);
        return this;
    }

    @Override
    public ILoader placeHolder(int id) {
        requestOptions.placeholder(id);
        return this;
    }

    @Override
    public ILoader error(int id) {
        requestOptions.error(id);
        return this;
    }

    @Override
    public ILoader dontAnimate() {
        requestOptions.dontAnimate();
        return this;
    }

    @Override
    public ILoader dontTransform() {
        requestOptions.dontTransform();
        return this;
    }

    @Override
    public ILoader override(int width, int height) {
        requestOptions.override(width, height);
        return this;
    }

    @Override
    public ILoader centerCrop() {
        requestOptions.centerCrop();
        return this;
    }

    @Override
    public ILoader centerInside() {
        requestOptions.centerInside();
        return this;
    }

    @Override
    public ILoader fitCenter() {
        requestOptions.fitCenter();
        return this;
    }

    @Override
    public ILoader asGif() {
        requestBuilder = requestManager.asGif();
        return this;
    }

    @Override
    public ILoader asBitmap() {
        requestBuilder = requestManager.asBitmap();
        return this;
    }

    @Override
    public ILoader load(String url) {
        if (requestBuilder != null) {
            requestBuilder.load(url);
        } else {
            requestBuilder = requestManager.load(url);
        }
        return this;
    }

    @Override
    public ILoader load(Uri uri) {
        if (requestBuilder != null) {
            requestBuilder.load(uri);
        } else {
            requestBuilder = requestManager.load(uri);
        }
        return this;
    }

    @Override
    public ILoader load(File file) {
        if (requestBuilder != null) {
            requestBuilder.load(file);
        } else {
            requestBuilder = requestManager.load(file);
        }
        return this;
    }

    @Override
    public ILoader load(Integer resourceId) {
        if (requestBuilder != null) {
            requestBuilder.load(resourceId);
        } else {
            requestBuilder = requestManager.load(resourceId);
        }
        return this;
    }

    @Override
    public ILoader thumbnail(float size) {
        requestBuilder.thumbnail(size);

        return this;
    }

    @Override
    public ILoader listener(RequestListener listener) {
        requestBuilder.listener(listener);

        return this;
    }

    @Override
    public ILoader argb8888() {
        requestOptions.format(DecodeFormat.PREFER_ARGB_8888);
        return this;
    }

    @Override
    public void pauseRequests() {
        if (requestBuilder != null) {
            requestManager.pauseRequests();
        }
    }

    @Override
    public void resumeRequests() {
        if (requestBuilder != null) {
            requestManager.resumeRequests();
        }
    }

    @Override
    public void into(ImageView imageView) {
        if (requestBuilder != null) {
            requestBuilder.apply(requestOptions).into(imageView);
        }
    }

}
