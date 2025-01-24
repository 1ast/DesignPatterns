package generative.factorymethod

import generative.factorymethod.dialog.Dialog
import generative.factorymethod.dialog.HtmlDialog
import generative.factorymethod.dialog.WindowsDialog

fun main() {
    val factoryMethod = FactoryMethod()
    factoryMethod.runLogic()
    factoryMethod.click()
}

class FactoryMethod {
    private val dialog: Dialog by lazy {
        configureDialog()
    }

    private fun configureDialog(): Dialog {
        return if (System.getProperty("os.name").equals("Windows 11")) {
            WindowsDialog()
        } else {
            HtmlDialog()
        }
    }

    fun runLogic() {
        dialog.render()
    }

    fun click() {
        dialog.clickButton()
    }
}