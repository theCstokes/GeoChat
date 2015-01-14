package com.firebase.geochat.FirebaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Chris on 2014-12-29.
 */
public class ServiceData<T> implements Serializable{
    private List<T> models;

    public void setModels(List<T> mModels) {
        this.models = mModels;
    }

    public List<T> getModels() {

        return this.models;
    }
}
