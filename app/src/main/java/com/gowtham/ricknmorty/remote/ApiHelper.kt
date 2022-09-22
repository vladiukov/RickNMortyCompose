package com.gowtham.ricknmorty.remote

import androidx.paging.PagingData
import com.gowtham.ricknmorty.utils.Resource
import fragment.CharacterDetail
import fragment.EpisodeDetail
import fragment.LocationDetail
import kotlinx.coroutines.flow.Flow

interface ApiHelper {

    fun getCharacters(): Flow<PagingData<CharacterDetail>>

    fun getEpisodes(): Flow<PagingData<EpisodeDetail>>

    fun getLocations(): Flow<PagingData<LocationDetail>>

    suspend fun getCharacter(characterId: String): Resource<CharacterDetail>

    suspend fun getEpisode(episodeId: String): Resource<EpisodeDetail>

    suspend fun getLocation(locationId: String): Resource<LocationDetail>
}
