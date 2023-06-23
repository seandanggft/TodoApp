package com.gft.todo.domain.usecase

import com.gft.todo.domain.repo.TodoRepo

class GetToDoListUseCase(
    private val todoRepo: TodoRepo,
) {
    suspend operator fun invoke(): Any {
        TODO("Your code here...")
    }
}
