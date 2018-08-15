package com.yooma.imageloader;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.yooma.imageloader.loader.GlideLoader;
import com.yooma.imageloader.loader.ILoader;

/**
 * 如果需要统一配置 ApplicationContext，需要在 Application 进行初始化
 */
public class ImageLoader {

    private static Context applicationContext;
    private static LoaderFactory loaderFactory = new LoaderFactory() {
        @Override
        public ILoader getLoader() {
            return new GlideLoader();
        }
    };

    public static void init(Context context) {
        applicationContext = context;
    }

    public static ILoader withAppContext() {
        if (applicationContext == null) {
            throw new IllegalStateException("ImageLoader 没有初始化");
        }
        return loaderFactory.getLoader().with(applicationContext);
    }

    public static ILoader with(Context context) {
        return loaderFactory.getLoader().with(context);
    }

    public static ILoader with(Fragment fragment) {
        return loaderFactory.getLoader().with(fragment);
    }

    public interface LoaderFactory {
        ILoader getLoader();
    }

}
