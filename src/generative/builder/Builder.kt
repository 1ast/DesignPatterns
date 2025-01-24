package generative.builder

import generative.builder.builders.CarBuilder
import generative.builder.builders.ManualCarBuilder
import generative.builder.director.Director

fun main() {
    val director = Director()
    val carBuilder = CarBuilder()

    director.constructSportCar(carBuilder)

    val car = carBuilder.build()
    println("Car built: ${car.type}")

    val carManualBuilder = ManualCarBuilder()
    director.constructCityCar(carManualBuilder)

    val carManual = carManualBuilder.build()

    println("Car manual built: ${carManual.type}")
    println(carManual.print())
}
