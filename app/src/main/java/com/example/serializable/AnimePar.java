package com.example.serializable;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class AnimePar implements Parcelable {

    private int id;
    private String name;
    private String description;
    private String type;
    private int year;
    private String image;
    private String favorite;

    protected AnimePar(Parcel in) {
        id = in.readInt();
        name = in.readString();
        description = in.readString();
        type = in.readString();
        year = in.readInt();
        image = in.readString();
        favorite = in.readString();
    }

    public static final Creator<AnimePar> CREATOR = new Creator<AnimePar>() {
        @Override
        public AnimePar createFromParcel(Parcel in) {
            return new AnimePar(in);
        }

        @Override
        public AnimePar[] newArray(int size) {
            return new AnimePar[size];
        }
    };




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(type);
        parcel.writeInt(year);
        parcel.writeString(image);
        parcel.writeString(favorite);
    }

    @Override
    public String toString() {
        return "AnimePar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", image='" + image + '\'' +
                ", favorite='" + favorite + '\'' +
                '}';
    }

    public AnimePar(int id, String name, String description, String type, int year, String image, String favorite) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.year = year;
        this.image = image;
        this.favorite = favorite;
    }
}
