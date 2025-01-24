package generative.builder.builders

import generative.builder.car.*
import generative.builder.components.*

class ManualCarBuilder: Builder {

    private var type: CarType? = null
    private var engine: Engine? = null
    private var gpsNavigator: GpsNavigator? = null
    private var transmission: Transmission? = null
    private var tripComputer: TripComputer? = null
    private var seats: Int? = null

    override fun setCarType(type: CarType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun setGpsNavigator(gpsNavigator: GpsNavigator) {
        this.gpsNavigator = gpsNavigator
    }

    fun build(): Manual {
        return Manual(type, engine, gpsNavigator, transmission, tripComputer, seats)
    }
}