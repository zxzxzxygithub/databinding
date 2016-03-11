package com.zyx.databinding;

import android.databinding.ObservableField;

public class ObserverFieldUser {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();

    public ObserverFieldUser(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
}