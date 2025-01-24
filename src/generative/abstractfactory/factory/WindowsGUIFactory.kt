package generative.abstractfactory.factory

import generative.abstractfactory.button.Button
import generative.abstractfactory.button.WindowsButton
import generative.abstractfactory.checkbox.Checkbox
import generative.abstractfactory.checkbox.WindowsCheckbox

class WindowsGUIFactory: GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}