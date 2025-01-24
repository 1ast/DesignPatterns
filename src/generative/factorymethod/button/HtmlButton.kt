package generative.factorymethod.button

class HtmlButton: Button {
    override fun render() {
        println("HTML button rendered")
    }

    override fun onClick() {
        println("HTML button clicked")
    }
}