package com.list_sample.retrofitmoshisample

import com.squareup.moshi.Json
import java.util.*

/**
 * Created by monkey on 2017/10/27.
 */
data class SearchResultModel(
        @Json(name = "results_returned") val resultsReturned: Int,
        @Json(name = "results_available") val resultsAvailable: Int,
        @Json(name = "results_start") val resultsStart: Int,
        val events:Any// List<Events>
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
        val limit: Int,
        @Json(name = "event_type") val eventType: String
)