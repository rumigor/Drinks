package ru.rumigor.drinks.data.api


import io.reactivex.Single
import retrofit2.http.GET
import ru.rumigor.drinks.data.model.Drink


interface DrinksApi {

    @GET("drinks")
    fun getDrinks(): Single<List<Drink>>



}