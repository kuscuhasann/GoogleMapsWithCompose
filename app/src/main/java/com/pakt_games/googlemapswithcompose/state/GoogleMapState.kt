package com.pakt_games.googlemapswithcompose.state

import android.location.Location
import com.pakt_games.googlemapswithcompose.clusters.ZoneClusterItem

data class GoogleMapState(
    val lastKnownLocation: Location?,
    val clusterItems: List<ZoneClusterItem>,
)