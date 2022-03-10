package com.shaparapatah.tests.presenter.details

import com.shaparapatah.tests.view.details.ViewDetailsContract
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    @Mock
    private lateinit var viewContract: ViewDetailsContract

    private var count: Int = 0

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = DetailsPresenter(viewContract, count)
    }

    @Test
    fun test_setCounter() {
        count = 0
        presenter.setCounter(count)
    }

    @Test
    fun test_onIncrement() {
        count = 0
        presenter.onIncrement()
        count++
        verify(viewContract, times(1)).setCount(count)
    }

    @Test
    fun test_onDecrement() {
        count = 0
        presenter.onDecrement()
        count--
        verify(viewContract, times(1)).setCount(count)
    }
}