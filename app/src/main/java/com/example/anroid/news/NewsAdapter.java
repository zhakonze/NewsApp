package com.example.anroid.news;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    List<News> mNewsInfo;

    public NewsAdapter(@NonNull Context context, List<News> newsList) {
        super(context, 0, newsList);
        mNewsInfo = newsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        News currentNews = mNewsInfo.get(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        String trimedDate = currentNews.getDate().substring(0, 10);

        TextView tvTitle = (TextView) view.findViewById(R.id.title_text_view);
        tvTitle.setText(currentNews.getTitle());

        TextView tvAuthor = (TextView) view.findViewById(R.id.author_text_view);
        tvAuthor.setText(currentNews.getAuthor());

        TextView tvDate = (TextView) view.findViewById(R.id.date_text_view);
        tvDate.setText(trimedDate);

        TextView tvType = (TextView) view.findViewById(R.id.type_text_view);
        tvType.setText(currentNews.getCategory());

        return view;
    }
}

