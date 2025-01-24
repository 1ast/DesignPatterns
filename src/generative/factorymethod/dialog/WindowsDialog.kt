package generative.factorymethod.dialog

import generative.factorymethod.button.Button
import generative.factorymethod.button.WindowsButton

class WindowsDialog: Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}