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

public final class TiendaBinding implements ViewBinding {
  @NonNull
  private final HorizontalScrollView rootView;

  @NonNull
  public final View BgTiendaEk2;

  @NonNull
  public final RelativeLayout antDesignHomeOutlinedEk1;

  @NonNull
  public final RelativeLayout antDesignPlayCircleFilled;

  @NonNull
  public final RelativeLayout antDesignReadOutlinedEk1;

  @NonNull
  public final RelativeLayout arrowLeftEk1;

  @NonNull
  public final TextView avatarClasico;

  @NonNull
  public final ImageView avatarclasico;

  @NonNull
  public final RelativeLayout contentContainer;

  @NonNull
  public final RelativeLayout frame4Ek1;

  @NonNull
  public final RelativeLayout frame5;

  @NonNull
  public final RelativeLayout group20Ek1;

  @NonNull
  public final RelativeLayout group21;

  @NonNull
  public final RelativeLayout group22Ek1;

  @NonNull
  public final RelativeLayout group23;

  @NonNull
  public final RelativeLayout group33;

  @NonNull
  public final RelativeLayout group37;

  @NonNull
  public final RelativeLayout group4;

  @NonNull
  public final RelativeLayout groupEk2;

  @NonNull
  public final RelativeLayout healthiconsUiUserProfileOutline;

  @NonNull
  public final ImageView homeEk1;

  @NonNull
  public final TextView homeEk2;

  @NonNull
  public final TextView miActividad;

  @NonNull
  public final TextView myProfile;

  @NonNull
  public final RelativeLayout pageTiendaEk1;

  @NonNull
  public final TextView puntuacion;

  @NonNull
  public final RelativeLayout star;

  @NonNull
  public final ScrollView tienda;

  @NonNull
  public final TextView tiendaEk3;

  @NonNull
  public final TextView tiendaEk4;

  @NonNull
  public final ImageView vectorEk22;

  @NonNull
  public final ImageView vectorEk23;

  @NonNull
  public final ImageView vectorEk24;

  @NonNull
  public final ImageView vectorEk25;

  @NonNull
  public final ImageView vectorEk26;

  @NonNull
  public final ImageView vectorEk27;

  @NonNull
  public final ImageView vectorEk28;

  @NonNull
  public final ImageView vectorEk29;

  private TiendaBinding(@NonNull HorizontalScrollView rootView, @NonNull View BgTiendaEk2,
      @NonNull RelativeLayout antDesignHomeOutlinedEk1,
      @NonNull RelativeLayout antDesignPlayCircleFilled,
      @NonNull RelativeLayout antDesignReadOutlinedEk1, @NonNull RelativeLayout arrowLeftEk1,
      @NonNull TextView avatarClasico, @NonNull ImageView avatarclasico,
      @NonNull RelativeLayout contentContainer, @NonNull RelativeLayout frame4Ek1,
      @NonNull RelativeLayout frame5, @NonNull RelativeLayout group20Ek1,
      @NonNull RelativeLayout group21, @NonNull RelativeLayout group22Ek1,
      @NonNull RelativeLayout group23, @NonNull RelativeLayout group33,
      @NonNull RelativeLayout group37, @NonNull RelativeLayout group4,
      @NonNull RelativeLayout groupEk2, @NonNull RelativeLayout healthiconsUiUserProfileOutline,
      @NonNull ImageView homeEk1, @NonNull TextView homeEk2, @NonNull TextView miActividad,
      @NonNull TextView myProfile, @NonNull RelativeLayout pageTiendaEk1,
      @NonNull TextView puntuacion, @NonNull RelativeLayout star, @NonNull ScrollView tienda,
      @NonNull TextView tiendaEk3, @NonNull TextView tiendaEk4, @NonNull ImageView vectorEk22,
      @NonNull ImageView vectorEk23, @NonNull ImageView vectorEk24, @NonNull ImageView vectorEk25,
      @NonNull ImageView vectorEk26, @NonNull ImageView vectorEk27, @NonNull ImageView vectorEk28,
      @NonNull ImageView vectorEk29) {
    this.rootView = rootView;
    this.BgTiendaEk2 = BgTiendaEk2;
    this.antDesignHomeOutlinedEk1 = antDesignHomeOutlinedEk1;
    this.antDesignPlayCircleFilled = antDesignPlayCircleFilled;
    this.antDesignReadOutlinedEk1 = antDesignReadOutlinedEk1;
    this.arrowLeftEk1 = arrowLeftEk1;
    this.avatarClasico = avatarClasico;
    this.avatarclasico = avatarclasico;
    this.contentContainer = contentContainer;
    this.frame4Ek1 = frame4Ek1;
    this.frame5 = frame5;
    this.group20Ek1 = group20Ek1;
    this.group21 = group21;
    this.group22Ek1 = group22Ek1;
    this.group23 = group23;
    this.group33 = group33;
    this.group37 = group37;
    this.group4 = group4;
    this.groupEk2 = groupEk2;
    this.healthiconsUiUserProfileOutline = healthiconsUiUserProfileOutline;
    this.homeEk1 = homeEk1;
    this.homeEk2 = homeEk2;
    this.miActividad = miActividad;
    this.myProfile = myProfile;
    this.pageTiendaEk1 = pageTiendaEk1;
    this.puntuacion = puntuacion;
    this.star = star;
    this.tienda = tienda;
    this.tiendaEk3 = tiendaEk3;
    this.tiendaEk4 = tiendaEk4;
    this.vectorEk22 = vectorEk22;
    this.vectorEk23 = vectorEk23;
    this.vectorEk24 = vectorEk24;
    this.vectorEk25 = vectorEk25;
    this.vectorEk26 = vectorEk26;
    this.vectorEk27 = vectorEk27;
    this.vectorEk28 = vectorEk28;
    this.vectorEk29 = vectorEk29;
  }

  @Override
  @NonNull
  public HorizontalScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static TiendaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TiendaBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.tienda, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TiendaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id._bg__tienda_ek2;
      View BgTiendaEk2 = ViewBindings.findChildViewById(rootView, id);
      if (BgTiendaEk2 == null) {
        break missingId;
      }

      id = R.id.ant_design_home_outlined_ek1;
      RelativeLayout antDesignHomeOutlinedEk1 = ViewBindings.findChildViewById(rootView, id);
      if (antDesignHomeOutlinedEk1 == null) {
        break missingId;
      }

      id = R.id.ant_design_play_circle_filled;
      RelativeLayout antDesignPlayCircleFilled = ViewBindings.findChildViewById(rootView, id);
      if (antDesignPlayCircleFilled == null) {
        break missingId;
      }

      id = R.id.ant_design_read_outlined_ek1;
      RelativeLayout antDesignReadOutlinedEk1 = ViewBindings.findChildViewById(rootView, id);
      if (antDesignReadOutlinedEk1 == null) {
        break missingId;
      }

      id = R.id.arrow_left_ek1;
      RelativeLayout arrowLeftEk1 = ViewBindings.findChildViewById(rootView, id);
      if (arrowLeftEk1 == null) {
        break missingId;
      }

      id = R.id.avatar_clasico;
      TextView avatarClasico = ViewBindings.findChildViewById(rootView, id);
      if (avatarClasico == null) {
        break missingId;
      }

      id = R.id.avatarclasico;
      ImageView avatarclasico = ViewBindings.findChildViewById(rootView, id);
      if (avatarclasico == null) {
        break missingId;
      }

      id = R.id.content_container;
      RelativeLayout contentContainer = ViewBindings.findChildViewById(rootView, id);
      if (contentContainer == null) {
        break missingId;
      }

      id = R.id.frame_4_ek1;
      RelativeLayout frame4Ek1 = ViewBindings.findChildViewById(rootView, id);
      if (frame4Ek1 == null) {
        break missingId;
      }

      id = R.id.frame_5;
      RelativeLayout frame5 = ViewBindings.findChildViewById(rootView, id);
      if (frame5 == null) {
        break missingId;
      }

      id = R.id.group_20_ek1;
      RelativeLayout group20Ek1 = ViewBindings.findChildViewById(rootView, id);
      if (group20Ek1 == null) {
        break missingId;
      }

      id = R.id.group_21;
      RelativeLayout group21 = ViewBindings.findChildViewById(rootView, id);
      if (group21 == null) {
        break missingId;
      }

      id = R.id.group_22_ek1;
      RelativeLayout group22Ek1 = ViewBindings.findChildViewById(rootView, id);
      if (group22Ek1 == null) {
        break missingId;
      }

      id = R.id.group_23;
      RelativeLayout group23 = ViewBindings.findChildViewById(rootView, id);
      if (group23 == null) {
        break missingId;
      }

      id = R.id.group_33;
      RelativeLayout group33 = ViewBindings.findChildViewById(rootView, id);
      if (group33 == null) {
        break missingId;
      }

      id = R.id.group_37;
      RelativeLayout group37 = ViewBindings.findChildViewById(rootView, id);
      if (group37 == null) {
        break missingId;
      }

      id = R.id.group_4;
      RelativeLayout group4 = ViewBindings.findChildViewById(rootView, id);
      if (group4 == null) {
        break missingId;
      }

      id = R.id.group_ek2;
      RelativeLayout groupEk2 = ViewBindings.findChildViewById(rootView, id);
      if (groupEk2 == null) {
        break missingId;
      }

      id = R.id.healthicons_ui_user_profile_outline;
      RelativeLayout healthiconsUiUserProfileOutline = ViewBindings.findChildViewById(rootView, id);
      if (healthiconsUiUserProfileOutline == null) {
        break missingId;
      }

      id = R.id.home_ek1;
      ImageView homeEk1 = ViewBindings.findChildViewById(rootView, id);
      if (homeEk1 == null) {
        break missingId;
      }

      id = R.id.home_ek2;
      TextView homeEk2 = ViewBindings.findChildViewById(rootView, id);
      if (homeEk2 == null) {
        break missingId;
      }

      id = R.id.mi_actividad;
      TextView miActividad = ViewBindings.findChildViewById(rootView, id);
      if (miActividad == null) {
        break missingId;
      }

      id = R.id.my_profile;
      TextView myProfile = ViewBindings.findChildViewById(rootView, id);
      if (myProfile == null) {
        break missingId;
      }

      id = R.id.page_tienda_ek1;
      RelativeLayout pageTiendaEk1 = ViewBindings.findChildViewById(rootView, id);
      if (pageTiendaEk1 == null) {
        break missingId;
      }

      id = R.id.puntuacion;
      TextView puntuacion = ViewBindings.findChildViewById(rootView, id);
      if (puntuacion == null) {
        break missingId;
      }

      id = R.id.star;
      RelativeLayout star = ViewBindings.findChildViewById(rootView, id);
      if (star == null) {
        break missingId;
      }

      id = R.id.tienda;
      ScrollView tienda = ViewBindings.findChildViewById(rootView, id);
      if (tienda == null) {
        break missingId;
      }

      id = R.id.tienda_ek3;
      TextView tiendaEk3 = ViewBindings.findChildViewById(rootView, id);
      if (tiendaEk3 == null) {
        break missingId;
      }

      id = R.id.tienda_ek4;
      TextView tiendaEk4 = ViewBindings.findChildViewById(rootView, id);
      if (tiendaEk4 == null) {
        break missingId;
      }

      id = R.id.vector_ek22;
      ImageView vectorEk22 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk22 == null) {
        break missingId;
      }

      id = R.id.vector_ek23;
      ImageView vectorEk23 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk23 == null) {
        break missingId;
      }

      id = R.id.vector_ek24;
      ImageView vectorEk24 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk24 == null) {
        break missingId;
      }

      id = R.id.vector_ek25;
      ImageView vectorEk25 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk25 == null) {
        break missingId;
      }

      id = R.id.vector_ek26;
      ImageView vectorEk26 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk26 == null) {
        break missingId;
      }

      id = R.id.vector_ek27;
      ImageView vectorEk27 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk27 == null) {
        break missingId;
      }

      id = R.id.vector_ek28;
      ImageView vectorEk28 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk28 == null) {
        break missingId;
      }

      id = R.id.vector_ek29;
      ImageView vectorEk29 = ViewBindings.findChildViewById(rootView, id);
      if (vectorEk29 == null) {
        break missingId;
      }

      return new TiendaBinding((HorizontalScrollView) rootView, BgTiendaEk2,
          antDesignHomeOutlinedEk1, antDesignPlayCircleFilled, antDesignReadOutlinedEk1,
          arrowLeftEk1, avatarClasico, avatarclasico, contentContainer, frame4Ek1, frame5,
          group20Ek1, group21, group22Ek1, group23, group33, group37, group4, groupEk2,
          healthiconsUiUserProfileOutline, homeEk1, homeEk2, miActividad, myProfile, pageTiendaEk1,
          puntuacion, star, tienda, tiendaEk3, tiendaEk4, vectorEk22, vectorEk23, vectorEk24,
          vectorEk25, vectorEk26, vectorEk27, vectorEk28, vectorEk29);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}