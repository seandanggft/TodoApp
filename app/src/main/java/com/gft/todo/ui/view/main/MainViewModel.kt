package com.gft.todo.ui.view.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.gft.todo.domain.usecase.GetToDoListUseCase
import com.gft.todo.network.repo.TodoRepoImpl

class MainViewModel(
    private val getToDoListUseCase: GetToDoListUseCase,
) : ViewModel() {
    // Use for Fragment
    val viewData = MutableLiveData(MainViewState())

    // Use for Jetpack Compose
    @Composable
    fun getViewState(): MainViewState = viewData.observeAsState(initial = MainViewState()).value

    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val todoRepo = TodoRepoImpl()
                val getToDoListUseCase = GetToDoListUseCase(todoRepo = todoRepo)
                return MainViewModel(getToDoListUseCase) as T
            }
        }
    }
}

@Stable
data class MainViewState(
    val value: Int = 0
)
