package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class People extends BaseObservable {
    String name, email;

    public People(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
