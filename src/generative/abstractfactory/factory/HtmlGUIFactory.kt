package generative.abstractfactory.factory

import generative.abstractfactory.button.Button
import generative.abstractfactory.button.HtmlButton
import generative.abstractfactory.checkbox.Checkbox
import generative.abstractfactory.checkbox.HtmlCheckbox

class HtmlGUIFactory: GUIFactory {
    override fun createButton(): Button {
        return HtmlButton()
    }

    override fun createCheckbox(): Checkbox {
        return HtmlCheckbox()
    }
}