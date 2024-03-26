package com.example.blackcofferassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ProfileAdapter extends ArrayAdapter<Profile> {

    private Context context;
    private ArrayList<Profile> profileList;

    public ProfileAdapter(Context context, ArrayList<Profile> profileList) {
        super(context, 0, profileList);
        this.context = context;
        this.profileList = profileList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_profile, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.profileImageView = convertView.findViewById(R.id.profileImageView);
            viewHolder.nameTextView = convertView.findViewById(R.id.nameTextView);
            viewHolder.descriptionTextView = convertView.findViewById(R.id.descriptionTextView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Profile profile = profileList.get(position);
        viewHolder.profileImageView.setImageResource(profile.getProfileImage());
        viewHolder.nameTextView.setText(profile.getName());
        viewHolder.descriptionTextView.setText(profile.getDescription());

        return convertView;
    }

    private static class ViewHolder {
        ImageView profileImageView;
        TextView nameTextView;
        TextView descriptionTextView;
    }
}

