package com.yooma.imageloader.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.yooma.imageloader.ImageLoader;

import static com.yooma.imageloader.demo.ImageUrl.URL1;
import static com.yooma.imageloader.demo.ImageUrl.URL3;
import static com.yooma.imageloader.demo.ImageUrl.URL4;
import static com.yooma.imageloader.demo.ImageUrl.URL5;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_test1;
    private ImageView iv_test2;
    private ImageView iv_test4;
    private ImageView iv_test5;
    private ImageView iv_test6;
    private ImageView iv_test7;
    private ImageView iv_test8;
    private ImageView iv_test9;
    private ImageView iv_test10;
    private ImageView iv_test12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageLoader.init(getApplicationContext());

        findview();

        load();
    }

    private void findview() {
        iv_test1 = (ImageView) findViewById(R.id.iv_test1);
        iv_test2 = (ImageView) findViewById(R.id.iv_test2);
        iv_test4 = (ImageView) findViewById(R.id.iv_test4);
        iv_test5 = (ImageView) findViewById(R.id.iv_test5);
        iv_test6 = (ImageView) findViewById(R.id.iv_test6);
        iv_test7 = (ImageView) findViewById(R.id.iv_test7);
        iv_test8 = (ImageView) findViewById(R.id.iv_test8);
        iv_test9 = (ImageView) findViewById(R.id.iv_test9);
        iv_test10 = (ImageView) findViewById(R.id.iv_test10);
        iv_test12 = (ImageView) findViewById(R.id.iv_test12);
    }

    private void load() {

        ImageLoader.with(this)
                .load(URL1)
                .placeHolder(R.mipmap.ic_launcher)
                .centerInside()
                .into(iv_test1);

        ImageLoader.with(this)
                .load(URL1)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test2);

        ImageLoader.with(this)
                .load(URL4)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test4);

        ImageLoader.with(this)
                .load(URL3)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test5);

        ImageLoader.with(this)
                .load(URL5)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test6);

        ImageLoader.with(this)
                .load(R.drawable.gif_test)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test7);

        ImageLoader.with(this)
                .load(R.drawable.jpeg_test)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test8);

        ImageLoader.with(this)
                .load(R.drawable.b000)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test9);

        ImageLoader.with(this)
                .load(R.drawable.b000)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test10);

        ImageLoader.with(this)
                .load(R.drawable.b000)
                .placeHolder(R.mipmap.ic_launcher)
                .into(iv_test12);

//        ImageLoader.with(this)
//                .load(getAssets() + IMG_NAME_C)
//                .placeHolder(R.mipmap.ic_launcher)
//                .into(iv_test13);

//        ImageLoader.with(this)
//                .raw(ANDROID_RESOURCE + getPackageName() + RAW + R.raw.jpeg_test)
//                .placeHolder(R.mipmap.ic_launcher)
//                .scale(ScaleMode.FIT_CENTER)
//                .asCircle()
//                .blur(20)
//                .into(iv_test14);
//
//        ImageLoader.with(this)
//                .raw(ANDROID_RESOURCE + getPackageName() + RAW + R.raw.jpeg_test)
//                .placeHolder(R.mipmap.ic_launcher)
//                .scale(ScaleMode.FIT_CENTER)
//                .asSquare()
//                .into(iv_test15);

//        ImageLoader.saveImageIntoGallery(new DownLoadImageService(SimpleActivity.this, URL3, true, "lala", new ImageDownLoadCallBack() {
//
//            @Override
//            public void onDownLoadSuccess(Bitmap bitmap) {
//                Log.e(TAG, "下载图片成功 bitmap");
//            }
//
//            @Override
//            public void onDownLoadFailed() {
//                Log.e(TAG, "下载图片失败");
//            }
//
//        }));
//
//        ImageLoader.withAppContext()
//                .load(URL3)
//                .toBitmap(new Simple);


    }
}
