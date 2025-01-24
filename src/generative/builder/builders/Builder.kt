package generative.builder.builders

import generative.builder.components.*

interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer)
    fun setGpsNavigator(gpsNavigator: GpsNavigator)
}