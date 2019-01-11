package com.lviv.komunalka.water;

import android.support.v4.app.Fragment;

import com.lviv.komunalka.BasePresenter;
import com.lviv.komunalka.BaseView;

public class WaterFragment extends Fragment implements WaterContract.View {


    WaterContract.Presenter mPresenter;

    @Override
    public void setPresenter(WaterContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
