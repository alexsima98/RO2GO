package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceID;


    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        this.colorResourceID = colorResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView romanianTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        romanianTextView.setText(currentWord.getRomanianTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.word_image_view);

        if (currentWord.hasImage()) {
            wordImageView.setImageResource(currentWord.getImageResourceID());
            wordImageView.setVisibility(View.VISIBLE);
        } else {
            wordImageView.setVisibility(View.GONE);
        }

        View listItem = listItemView.findViewById(R.id.list_item);
        listItem.setBackgroundResource(this.colorResourceID);
        return listItemView;
    }
}























