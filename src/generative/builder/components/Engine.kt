package generative.builder.components

data class Engine(val volume: Double, private var mileage: Double) {
    private var started = false

    fun on() {
        started = true
    }

    fun off() {
        started = false
    }

    fun isStarted() = started

    fun go(mileage: Double) {
        if (started) {
            this.mileage += mileage
        } else {
            System.err.println("Cannot go(), you must start engine first!")
        }
    }

    fun getMileage() = mileage
}
