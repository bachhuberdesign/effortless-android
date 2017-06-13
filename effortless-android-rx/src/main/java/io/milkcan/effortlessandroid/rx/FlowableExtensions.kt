@file:JvmName("ObservableExtensions")
@file:Suppress("NOTHING_TO_INLINE", "unused")

package io.milkcan.effortlessandroid.rx

import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * A collection of helpful functions that extend [Flowable].
 *
 * @author Eric Bachhuber (bachhuberdesign@gmail.com)
 * @version 0.0.5
 * @since 0.0.5
 */

inline fun <T> Flowable<T>.defaultThreads(): Flowable <T> {
    return subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}