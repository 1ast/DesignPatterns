package generative.factorymethod.button

class WindowsButton: Button {
    override fun render() {
        println("Windows button rendered")
    }

    override fun onClick() {
        println("Windows button clicked")
    }
}