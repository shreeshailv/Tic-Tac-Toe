package com.shreeshail.tictactoe.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.shreeshail.tictactoe.viewmodel.GameViewModel;

public abstract class ActivityGameBinding extends ViewDataBinding {
  @NonNull
  public final TextView cell00;

  @NonNull
  public final TextView cell01;

  @NonNull
  public final TextView cell02;

  @NonNull
  public final TextView cell10;

  @NonNull
  public final TextView cell11;

  @NonNull
  public final TextView cell12;

  @NonNull
  public final TextView cell20;

  @NonNull
  public final TextView cell21;

  @NonNull
  public final TextView cell22;

  @Bindable
  protected GameViewModel mGameViewModel;

  protected ActivityGameBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView cell00, TextView cell01, TextView cell02, TextView cell10,
      TextView cell11, TextView cell12, TextView cell20, TextView cell21, TextView cell22) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cell00 = cell00;
    this.cell01 = cell01;
    this.cell02 = cell02;
    this.cell10 = cell10;
    this.cell11 = cell11;
    this.cell12 = cell12;
    this.cell20 = cell20;
    this.cell21 = cell21;
    this.cell22 = cell22;
  }

  public abstract void setGameViewModel(@Nullable GameViewModel gameViewModel);

  @Nullable
  public GameViewModel getGameViewModel() {
    return mGameViewModel;
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityGameBinding>inflate(inflater, com.shreeshail.tictactoe.R.layout.activity_game, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityGameBinding>inflate(inflater, com.shreeshail.tictactoe.R.layout.activity_game, null, false, component);
  }

  public static ActivityGameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityGameBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityGameBinding)bind(component, view, com.shreeshail.tictactoe.R.layout.activity_game);
  }
}
