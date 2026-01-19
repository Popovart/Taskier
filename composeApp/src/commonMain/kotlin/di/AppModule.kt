package di

import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.includes
import org.koin.dsl.module
import screens.main.MainViewModel

class Repository() {

}

class Service(repository: Repository) {

}

val AppModule = module {
    singleOf (::Repository)
    singleOf (::Service)
    singleOf (::MainViewModel)
}

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        includes(config)
        modules(AppModule)
    }
}

