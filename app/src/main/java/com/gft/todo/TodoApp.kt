package com.gft.todo

import android.app.Application
import android.content.Context
import com.gft.todo.network.NetworkModule
import com.gft.todo.network.RepoModule
import com.gft.todo.ui.view.main.MainFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, RepoModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: MainFragment)
}

class TodoApp : Application() {
    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }
}
