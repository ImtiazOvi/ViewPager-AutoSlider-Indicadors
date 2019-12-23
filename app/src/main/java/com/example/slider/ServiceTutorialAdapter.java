package com.example.slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ServiceTutorialAdapter extends PagerAdapter {

    private int[] image_resourses = {R.drawable.service_tutorial_find_your_products_image,
            R.drawable.service_tutorial_find_your_products_image2,
            R.drawable.service_tutorial_find_your_products_image3,
            R.drawable.service_tutorial_find_your_products_image4,
            R.drawable.service_tutorial_find_your_products_image5};
    private String[] slider_title = {
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet"};

    private String[] slider_description = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Nullam rhoncus ullamcorper eros, egestas placerat elit semper a. Vestibulum cursus, elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Nullam rhoncus ullamcorper eros, egestas placerat elit semper a. Vestibulum cursus, elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Nullam rhoncus ullamcorper eros, egestas placerat elit semper a. Vestibulum cursus, elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Nullam rhoncus ullamcorper eros, egestas placerat elit semper a. Vestibulum cursus, elit.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Nullam rhoncus ullamcorper eros, egestas placerat elit semper a. Vestibulum cursus, elit."};

    private Context context;
    LayoutInflater layoutInflater;


    public ServiceTutorialAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_resourses.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout, container, false);
        ImageView imageView = view.findViewById(R.id.service_image);
        TextView titleTextView = view.findViewById(R.id.serviceTitle);
        TextView descriptionTextView = view.findViewById(R.id.service_description);

        imageView.setImageResource(image_resourses[position]);
        titleTextView.setText(slider_title[position]);
        descriptionTextView.setText(slider_description[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
