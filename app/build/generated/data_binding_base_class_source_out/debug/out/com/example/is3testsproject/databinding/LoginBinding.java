// Generated by view binder compiler. Do not edit!
package com.example.is3testsproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.is3testsproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginBinding implements ViewBinding {
  @NonNull
  private final HorizontalScrollView rootView;

  @NonNull
  public final View BgLoginEk2;

  @NonNull
  public final RelativeLayout contentContainer;

  @NonNull
  public final TextView contraseAEk1;

  @NonNull
  public final ImageView contrasenhabox;

  @NonNull
  public final TextView correoEk2;

  @NonNull
  public final RelativeLayout correobox;

  @NonNull
  public final ImageView correoboxEk1;

  @NonNull
  public final RelativeLayout frame2Ek1;

  @NonNull
  public final RelativeLayout frame4Ek5;

  @NonNull
  public final RelativeLayout frame5Ek3;

  @NonNull
  public final RelativeLayout group47Ek1;

  @NonNull
  public final RelativeLayout icOutlinePrivacyTipEk2;

  @NonNull
  public final RelativeLayout icOutlinePrivacyTipEk3;

  @NonNull
  public final TextView ingresar;

  @NonNull
  public final ScrollView login;

  @NonNull
  public final TextView loginEk3;

  @NonNull
  public final RelativeLayout pageLoginEk1;

  @NonNull
  public final TextView registrarseEk1;

  @NonNull
  public final ImageView vectorEk78;

  @NonNull
  public final ImageView vectorEk79;

  private LoginBinding(@NonNull HorizontalScrollView rootView, @NonNull View BgLoginEk2,
      @NonNull RelativeLayout contentContainer, @NonNull TextView contraseAEk1,
      @NonNull ImageView contrasenhabox, @NonNull TextView correoEk2,
      @NonNull RelativeLayout correobox, @NonNull ImageView correoboxEk1,
      @NonNull RelativeLayout frame2Ek1, @NonNull RelativeLayout frame4Ek5,
      @NonNull RelativeLayout frame5Ek3, @NonNull RelativeLayout group47Ek1,
      @NonNull RelativeLayout icOutlinePrivacyTipEk2,
      @NonNull RelativeLayout icOutlinePrivacyTipEk3, @NonNull TextView ingresar,
      @NonNull ScrollView login, @NonNull TextView loginEk3, @NonNull RelativeLayout pageLoginEk1,
      @NonNull TextView registrarseEk1, @NonNull ImageView vectorEk78,
      @NonNull ImageView vectorEk79) {
    this.rootView = rootView;
    this.BgLoginEk2 = BgLoginEk2;
    this.contentContainer = contentContainer;
    this.contraseAEk1 = contraseAEk1;
    this.contrasenhabox = contrasenhabox;
    this.correoEk2 = correoEk2;
    this.correobox = correobox;
    this.correoboxEk1 = correoboxEk1;
    this.frame2Ek1 = frame2Ek1;
    this.frame4Ek5 = frame4Ek5;
    this.frame5Ek3 = frame5Ek3;
    this.group47Ek1 = group47Ek1;
    this.icOutlinePrivacyTipEk2 = icOutlinePrivacyTipEk2;
    this.icOutlinePrivacyTipEk3 = icOutlinePrivacyTipEk3;
    this.ingresar = ingresar;
    this.login = login;
    this.loginEk3 = loginEk3;
    this.pageLoginEk1 = pageLoginEk1;
    this.registrarseEk1 = registrarseEk1;
    this.vectorEk78 = vectorEk78;
    this.vectorEk79 = vectorEk79;
  }

  @Override
  @NonNull
  public HorizontalScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id._bg__login_ek2;
      View BgLoginEk2 = ViewBindings.findChildViewById(rootView, id);
      if (BgLoginEk2 == null) {
        break missingId;
      }

      id = R.id.content_container;
      RelativeLayout contentContainer = ViewBindings.findChildViewById(rootView, id);
      if (contentContainer == null) {
        break missingId;
      }

      id = R.id.contrase_a_ek1;
      TextView contraseAEk1 = ViewBindings.findChildViewById(rootView, id);
      if (contraseAEk1 == null) {
        break missingId;
      }

      id = R.id.contrasenhabox;
      ImageView contrasenhabox = ViewBindings.findChildViewById(rootView, id);
      if (contrasenhabox == null) {
        break missingId;
      }

      id = R.id.correo_ek2;
      TextView correoEk2 = ViewBindings.findChildViewById(rootView, id);
      if (correoEk2 == null) {
        break missingId;
      }

      id = R.id.correobox;
      RelativeLayout correobox = ViewBindings.findChildViewById(rootView, id);
      if (correobox == null) {
        break missingId;
      }

      id = R.id.correobox_ek1;
      ImageView correoboxEk1 = ViewBindings.findChildViewById(rootView, id);
      if (correoboxEk1 == null) {
        break missingId;
      }

      id = R.id.frame_2_ek1;
      RelativeLayout frame2Ek1 = ViewBindings.findChildViewById(rootView, id);
      if (frame2Ek1 == null) {
        break missingId;
      }

      id = R.id.frame_4_ek5;
      RelativeLayout frame4Ek5 = ViewBindings.findChildViewById(rootView, id);
      if (frame4Ek5 == null) {
        break missingId;
      }

      id = R.id.frame_5_ek3;
      RelativeLayout frame5Ek3 = ViewBindings.findChildViewById(rootView, id);
      if (frame5Ek3 == null) {
        break missingId;
      }

      id = R.id.group_47_ek1;
      RelativeLayout group47Ek1 = ViewBindings.findChildViewById(rootView, id);
      if (group47Ek1 == null) {
        break missingId;
      }

      id = R.id.ic_outline_privacy_tip_ek2;
      RelativeLayout icOutlinePrivacyTipEk2 = ViewBindings.findChildViewById(rootView, id);
      if (icOutlinePrivacyTipEk2 == null) {
        break missingId;
      }

      id = R.id.ic_outline_privacy_tip_ek3;
      RelativeLayout icOutlinePrivacyTipEk3 = ViewBindings.findChildViewById(rootView, id);
      if (icOutlinePrivacyTipEk3 == null) {
        break missingId;
      }

      id = R.id.ingresar;
      TextView ingresar = ViewBindings.findChildViewById(rootView, id);
      if (ingresar == null) {
        break missingId;
      }

      id = R.id.login;
      ScrollView login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.login_ek3;
      TextView loginEk3 = ViewBindings.findChildViewById(rootView, id);
      if (loginEk3 == null) {
        break missingId;
      }

      id = R.id.page_login_ek1;
      RelativeLayout pageLoginEk1 = ViewBindings.findChildViewById(rootView, id);
      if (pageLoginEk1 == null) {
        break missingId;
      }

      id = R.id.registrarse_ek1;
      TextView registrarseEk1 = ViewBindings.findChildViewById(rootView, id);
      if (registrarseEk1 == null) {
        break missingId;
      }

      id = R.id.vector_ek78;
      ImageView vectorEk78 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk78 == null) {
        break missingId;
      }

      id = R.id.vector_ek79;
      ImageView vectorEk79 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk79 == null) {
        break missingId;
      }

      return new LoginBinding((HorizontalScrollView) rootView, BgLoginEk2, contentContainer,
          contraseAEk1, contrasenhabox, correoEk2, correobox, correoboxEk1, frame2Ek1, frame4Ek5,
          frame5Ek3, group47Ek1, icOutlinePrivacyTipEk2, icOutlinePrivacyTipEk3, ingresar, login,
          loginEk3, pageLoginEk1, registrarseEk1, vectorEk78, vectorEk79);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}