package com.shaparapatah.tests.view.search

import com.shaparapatah.tests.model.SearchResult
import com.shaparapatah.tests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
