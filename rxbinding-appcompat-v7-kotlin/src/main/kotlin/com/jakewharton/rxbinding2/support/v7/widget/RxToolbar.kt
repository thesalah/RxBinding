@file:Suppress(
    names = "NOTHING_TO_INLINE"
)

package com.jakewharton.rxbinding2.support.v7.widget

import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.jakewharton.rxbinding2.internal.VoidToUnit
import io.reactivex.Observable
import io.reactivex.functions.Consumer
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Create an observable which emits the clicked item in `view`'s menu.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun Toolbar.itemClicks(): Observable<MenuItem> = RxToolbar.itemClicks(this)

/**
 * Create an observable which emits on `view` navigation click events. The emitted value is
 * unspecified and should only be used as notification.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 *
 * *Warning:* The created observable uses [Toolbar.setNavigationOnClickListener]
 * to observe clicks. Only one observable can be used for a view at a time.
 */
inline fun Toolbar.navigationClicks(): Observable<Unit> = RxToolbar.navigationClicks(this).map(VoidToUnit)

/**
 * An action which sets the title property of `view` with character sequences.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun Toolbar.title(): Consumer<in CharSequence?> = RxToolbar.title(this)

/**
 * An action which sets the title property of `view` string resource IDs.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun Toolbar.titleRes(): Consumer<in Int> = RxToolbar.titleRes(this)

/**
 * An action which sets the subtitle property of `view` with character sequences.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun Toolbar.subtitle(): Consumer<in CharSequence?> = RxToolbar.subtitle(this)

/**
 * An action which sets the subtitle property of `view` string resource IDs.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
inline fun Toolbar.subtitleRes(): Consumer<in Int> = RxToolbar.subtitleRes(this)
