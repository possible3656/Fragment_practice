package com.pscube.fragment_practice;

import android.os.Parcel;
import android.os.Parcelable;

public class model implements Parcelable {
    String firstName , secondName , thirdName;

    public model() {
    }

    public model(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    @Override
    public String toString() {
        return "model{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.secondName);
        dest.writeString(this.thirdName);
    }

    protected model(Parcel in) {
        this.firstName = in.readString();
        this.secondName = in.readString();
        this.thirdName = in.readString();
    }

    public static final Parcelable.Creator<model> CREATOR = new Parcelable.Creator<model>() {
        @Override
        public model createFromParcel(Parcel source) {
            return new model(source);
        }

        @Override
        public model[] newArray(int size) {
            return new model[size];
        }
    };
}
