package generative.factorymethod.dialog

import generative.factorymethod.button.Button
import generative.factorymethod.button.HtmlButton

class HtmlDialog: Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}