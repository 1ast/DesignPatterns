package generative.builder.components

import generative.builder.car.Car

class TripComputer {
    var car: Car? = null

    fun showFuelLevel() {
        println("Fuel level: ${car?.fuel}")
    }

    fun showStatus() {
        println(if (car?.engine?.isStarted() == true) "Car is started" else "Car isn't started")
    }
}