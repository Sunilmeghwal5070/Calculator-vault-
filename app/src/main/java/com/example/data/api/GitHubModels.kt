package com.example.data.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GitHubRelease(
    @Json(name = "tag_name") val tagName: String,
    @Json(name = "name") val name: String,
    @Json(name = "body") val body: String,
    @Json(name = "assets") val assets: List<GitHubAsset>
)

@JsonClass(generateAdapter = true)
data class GitHubAsset(
    @Json(name = "name") val name: String,
    @Json(name = "browser_download_url") val downloadUrl: String,
    @Json(name = "size") val size: Long
)
