package com.shaparapatah.tests.presenter.details

import com.shaparapatah.tests.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
