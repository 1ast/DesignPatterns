package generative.abstractfactory.button

class HtmlButton: Button {
    override fun paint() {
        println("Html button painted")
    }
}