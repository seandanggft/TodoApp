package com.gft.todo.network.repo

import com.gft.todo.network.api.TodoApi
import com.gft.todo.domain.repo.TodoRepo

class TodoRepoImpl: TodoRepo {
    private lateinit var todoApi: TodoApi // Hint: NetworkUtils.createRetrofitInstance

    override suspend fun getTodos(): Any {
        TODO("Your code here...")
    }
}
