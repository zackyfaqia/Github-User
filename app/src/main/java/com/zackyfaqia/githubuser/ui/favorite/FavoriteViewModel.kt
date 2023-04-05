package com.zackyfaqia.githubuser.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.zackyfaqia.githubuser.data.local.FavoriteUser
import com.zackyfaqia.githubuser.data.local.FavoriteUserDao
import com.zackyfaqia.githubuser.data.local.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private val userDao: FavoriteUserDao?
    private val userDb: UserDatabase?

    init {
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}