package generative.builder.car

import generative.builder.components.*

data class Manual(
    val type: CarType?,
    val engine: Engine?,
    val gpsNavigator: GpsNavigator?,
    val transmission: Transmission?,
    val tripComputer: TripComputer?,
    val seats: Int?
) {
    fun print() {
        println(this.toString())
    }
}