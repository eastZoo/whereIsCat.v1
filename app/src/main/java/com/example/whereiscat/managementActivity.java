package com.example.whereiscat;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class managementActivity extends AppCompatActivity {

    Button btn_feed, btn_board, btn_finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);


        btn_finish = findViewById(R.id.btn_finish1);

        ImageView img1 = (ImageView)findViewById(R.id.empty_feed1); //빈밥그릇
        ImageView img2 = (ImageView)findViewById(R.id.empty_feed2);
        ImageView img3 = (ImageView)findViewById(R.id.empty_feed3);
        ImageView img4 = (ImageView)findViewById(R.id.empty_feed4);
        ImageView img5 = (ImageView)findViewById(R.id.empty_feed5);
        img1.setImageResource(R.drawable.empty_cat);  //이미지뷰에 이미지를 설정
        img2.setImageResource(R.drawable.empty_cat);
        img3.setImageResource(R.drawable.empty_cat);
        img4.setImageResource(R.drawable.empty_cat);
        img5.setImageResource(R.drawable.empty_cat);

        ImageView img6 = (ImageView)findViewById(R.id.empty_snack1); //빈간식
        ImageView img7 = (ImageView)findViewById(R.id.empty_snack2);
        ImageView img8 = (ImageView)findViewById(R.id.empty_snack3);
        ImageView img9 = (ImageView)findViewById(R.id.empty_snack4);
        ImageView img0 = (ImageView)findViewById(R.id.empty_snack5);
        img6.setImageResource(R.drawable.empty_snack);  //이미지뷰에 이미지를 변경
        img7.setImageResource(R.drawable.empty_snack);
        img8.setImageResource(R.drawable.empty_snack);
        img9.setImageResource(R.drawable.empty_snack);
        img0.setImageResource(R.drawable.empty_snack);

        ImageView img11 = (ImageView)findViewById(R.id.empty_180); //빈 물
        ImageView img12 = (ImageView)findViewById(R.id.empty_300);
        ImageView img13 = (ImageView)findViewById(R.id.empty_500);
        ImageView img14 = (ImageView)findViewById(R.id.empty_1l);
        img11.setImageResource(R.drawable.water_e180);  //이미지뷰에 이미지를 변경
        img12.setImageResource(R.drawable.water_e300);
        img13.setImageResource(R.drawable.water_e500);
        img14.setImageResource(R.drawable.water_e1l);

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);

        //빈밥그릇 클릭시 이미지 변경
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img1.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_cat);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img1.setImageResource(R.drawable.empty_cat);
                    //로직 수행
                } else {
                    img1.setImageResource(R.drawable.full_cat);
                    //로직 수행
                }}});
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img2.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_cat);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img2.setImageResource(R.drawable.empty_cat);
                    //로직 수행
                } else {
                    img2.setImageResource(R.drawable.full_cat);
                    //로직 수행
                }}});
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img3.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_cat);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img3.setImageResource(R.drawable.empty_cat);
                    //로직 수행
                } else {
                    img3.setImageResource(R.drawable.full_cat);
                    //로직 수행
                }}});
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img4.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_cat);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img4.setImageResource(R.drawable.empty_cat);
                    //로직 수행
                } else {
                    img4.setImageResource(R.drawable.full_cat);
                    //로직 수행
                }}});
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img5.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_cat);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img5.setImageResource(R.drawable.empty_cat);
                    //로직 수행
                } else {
                    img5.setImageResource(R.drawable.full_cat);
                    //로직 수행
                }}});
        //빈 간식 클릭시 이미지 변경
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img6.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_snack);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img6.setImageResource(R.drawable.empty_snack);
                    //로직 수행
                } else {
                    img6.setImageResource(R.drawable.full_snack);
                    //로직 수행
                }}});
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img7.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_snack);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img7.setImageResource(R.drawable.empty_snack);
                    //로직 수행
                } else {
                    img7.setImageResource(R.drawable.full_snack);
                    //로직 수행
                }}});
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img8.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_snack);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img8.setImageResource(R.drawable.empty_snack);
                    //로직 수행
                } else {
                    img8.setImageResource(R.drawable.full_snack);
                    //로직 수행
                }}});
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img9.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_snack);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img9.setImageResource(R.drawable.empty_snack);
                    //로직 수행
                } else {
                    img9.setImageResource(R.drawable.full_snack);
                    //로직 수행
                }}});
        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img0.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.full_snack);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img0.setImageResource(R.drawable.empty_snack);
                    //로직 수행
                } else {
                    img0.setImageResource(R.drawable.full_snack);
                    //로직 수행
                }}});

        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managementActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //빈 물 클릭시 이미지 변경
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img11.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.water_180);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img11.setImageResource(R.drawable.water_e180);
                    //로직 수행
                } else {
                    img11.setImageResource(R.drawable.water_180);
                    //로직 수행
                }}});
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img12.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.water_300);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img12.setImageResource(R.drawable.water_e300);
                    //로직 수행
                } else {
                    img12.setImageResource(R.drawable.water_300);
                    //로직 수행
                }}});
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img13.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.water_500);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img13.setImageResource(R.drawable.water_e500);
                    //로직 수행
                } else {
                    img13.setImageResource(R.drawable.water_500);
                    //로직 수행
                }}});
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable tempImg = img14.getDrawable();
                Drawable tempRes = getResources().getDrawable(R.drawable.water_1l);
                Bitmap tmpBitmap = ((BitmapDrawable) tempImg).getBitmap();
                Bitmap tmpBitmapRes = ((BitmapDrawable) tempRes).getBitmap();

                if (tmpBitmap.equals(tmpBitmapRes)) {
                    img14.setImageResource(R.drawable.water_e1l);
                    //로직 수행
                } else {
                    img14.setImageResource(R.drawable.water_1l);
                    //로직 수행
                }}});
    }
    public class MyGalleryAdapter extends BaseAdapter {
        Context context;
        Integer[] catID = {R.drawable.cat_1, R.drawable.cat_2, R.drawable.cat_3, R.drawable.cat_4 };
        public MyGalleryAdapter(Context c) { context = c; }
        public int getCount(){ return catID.length; }
        public Object getItem(int arg0){ return null; }
        public long getItemId(int position) { return 0; }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(500, 500));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);
            imageview.setImageResource(catID[position]);

            return imageview;

        }
    }}
