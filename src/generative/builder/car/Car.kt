package generative.builder.car

import generative.builder.components.*

open class Car(
    val type: CarType?,
    val engine: Engine?,
    val gpsNavigator: GpsNavigator?,
    val transmission: Transmission?,
    val tripComputer: TripComputer?,
    val seats: Int?,
    var fuel: Double = 0.0
) {
    open fun run() {
        println("drive")
    }
}