package com.gft.todo.ui.view.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gft.todo.domain.usecase.GetToDoListUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getToDoListUseCase: GetToDoListUseCase,
) : ViewModel() {
    // You can get/set data here
    val viewData = MutableLiveData(MainViewState())

    // If you use Jetpack Compose to build UI, you can get data here
    @Composable
    fun getViewState(): MainViewState = viewData.observeAsState(initial = MainViewState()).value

}

@Stable
data class MainViewState(
    val value: Int = 0
)
