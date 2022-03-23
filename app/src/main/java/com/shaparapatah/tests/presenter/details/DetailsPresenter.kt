package com.shaparapatah.tests.presenter.details

import com.shaparapatah.tests.view.details.ViewDetailsContract

internal class DetailsPresenter internal constructor(
    private var viewContract: ViewDetailsContract? = null,
    private var count: Int = 0
) : PresenterDetailsContract {

    override fun onAttach() {
        viewContract != null
    }

    override fun setCounter(count: Int) {
        this.count = count
    }

    override fun onIncrement() {
        count++
        viewContract?.setCount(count)
    }

    override fun onDecrement() {
        count--
        viewContract?.setCount(count)
    }

    override fun onDetach() {
        viewContract = null
    }
}
