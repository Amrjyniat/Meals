package com.example.meals.data.network.factory

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson


class TagsAdapter {

    @ToJson
    fun toJson(@TagList list: List<String>): String {
        throw UnsupportedOperationException()
    }

    @FromJson
    @TagList
    fun fromJson(tagsWithComma: String): List<String> {
        return tagsWithComma.split(",")
    }

}