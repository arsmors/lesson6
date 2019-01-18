package com.example.den.lesson6.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.den.lesson6.Interfaces.PhotoItem;
import com.example.den.lesson6.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public PhotoItem photoItem;

    @BindView(R.id.imageViewImage) ImageView imageViewImage;
    @BindView(R.id.textViewAuthor) TextView textViewAuthor;


    public InfoFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_info, container, false);
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);

        Picasso.get().load(photoItem.getImgUrl()).into(imageViewImage);
        textViewAuthor.setText(photoItem.getAuthorName());

        return view;
    }

}
