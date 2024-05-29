package com.gft.todo.network.repo

import com.gft.todo.network.api.TodoApi
import com.gft.todo.domain.repo.TodoRepo

class TodoRepoImpl(val todoApi: TodoApi) : TodoRepo {

    override suspend fun getTodos(): Any {
        TODO("Your code here...")
    }
}
