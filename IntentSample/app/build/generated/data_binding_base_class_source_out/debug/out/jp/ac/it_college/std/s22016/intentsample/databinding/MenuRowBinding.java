// Generated by view binder compiler. Do not edit!
package jp.ac.it_college.std.s22016.intentsample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import jp.ac.it_college.std.s22016.intentsample.R;

public final class MenuRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvYen;

  private MenuRowBinding(@NonNull ConstraintLayout rootView, @NonNull TextView tvName,
      @NonNull TextView tvPrice, @NonNull TextView tvYen) {
    this.rootView = rootView;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvYen = tvYen;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvPrice;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tvYen;
      TextView tvYen = ViewBindings.findChildViewById(rootView, id);
      if (tvYen == null) {
        break missingId;
      }

      return new MenuRowBinding((ConstraintLayout) rootView, tvName, tvPrice, tvYen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
