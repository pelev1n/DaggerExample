package com.andrewxa.a36dagger2simpleexample;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public final class MainActivity extends Activity {

    @Inject
    AppDependency appDependency; // same object from App

    @Inject
    ActivityDependency activityDependency;
/*

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;
*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityDependency.helloMethod();
        /*if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new MainFragment());
        }*/
    }
/*
    @Override
    public final AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }*/

/*    private final void addFragment(@IdRes int containerViewId, Fragment fragment) {
        getFragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit();
    }*/
}