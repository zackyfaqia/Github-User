package com.zackyfaqia.githubuser.api

import com.zackyfaqia.githubuser.data.model.DetailUserResponse
import com.zackyfaqia.githubuser.data.model.User
import com.zackyfaqia.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}