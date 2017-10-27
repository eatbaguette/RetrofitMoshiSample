package com.list_sample.retrofitmoshisample

import com.squareup.moshi.Json
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by monkey on 2017/10/27.
 */
data class SearchResultModel(
        @Json(name = "results_returned") val resultsReturned: Int,
        @Json(name = "results_available") val resultsAvailable: Int,
        @Json(name = "results_start") val resultsStart: Int,
        val events: List<Events>
        )

data class Events(
        @Json(name = "event_id") val eventId: Int,
        val title: String,
        val catch: String,
        val description: String,
        @Json(name = "event_url") val eventUrl: String,
        @Json(name = "hash_tag") val hashTag: String,
        @Json(name = "started_at") val startedAt: String,
        @Json(name = "ended_at") val endedAt: String,
        val limit: Int?,
        @Json(name = "event_type") val eventType: String,
        val series:Series,
        val address: String,
        val place: String,
        val lat: Float,
        val lon: Float,
        @Json(name = "ownerId") val owner_id: Int,
        @Json(name = "ownerNickname") val owner_nickname: String,
        @Json(name = "ownerDisplayName") val owner_display_name: String,
        val accepted: Int,
        val waiting: Int,
        @Json(name = "updated_at") val updatedAt: String
)

data class Series(
        val id: Int,
        val title: String,
        val url: String
)