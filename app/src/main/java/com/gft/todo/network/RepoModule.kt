package com.gft.todo.network

import com.gft.todo.domain.repo.TodoRepo
import com.gft.todo.network.repo.TodoRepoImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun provideTodoRepo(impl: TodoRepoImpl): TodoRepo
}
