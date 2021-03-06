package com.afollestad.aesthetic;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static com.afollestad.aesthetic.TabLayoutIndicatorMode.ACCENT;
import static com.afollestad.aesthetic.TabLayoutIndicatorMode.PRIMARY;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/** @author Aidan Follestad (afollestad) */
@Retention(SOURCE)
@IntDef(value = {PRIMARY, ACCENT})
public @interface TabLayoutIndicatorMode {
  int PRIMARY = 0;
  int ACCENT = 1;
}
