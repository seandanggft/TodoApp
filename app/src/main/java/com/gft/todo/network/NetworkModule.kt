package com.gft.todo.network

import com.gft.todo.network.api.TodoApi
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideRetrofitService(): TodoApi {
        TODO("Put your code here...")
    }
}
