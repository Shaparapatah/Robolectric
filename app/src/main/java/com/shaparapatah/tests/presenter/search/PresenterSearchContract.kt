package com.shaparapatah.tests.presenter.search

import com.shaparapatah.tests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)

    fun onAttach()

    fun onDetach()


}
