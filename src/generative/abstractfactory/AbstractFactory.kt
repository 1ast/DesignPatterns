package generative.abstractfactory

import generative.abstractfactory.button.Button
import generative.abstractfactory.checkbox.Checkbox
import generative.abstractfactory.factory.GUIFactory
import generative.abstractfactory.factory.HtmlGUIFactory
import generative.abstractfactory.factory.WindowsGUIFactory

fun main() {
    val guiFactory = if (System.getProperty("os.name").equals("Windows 11")) WindowsGUIFactory() else HtmlGUIFactory()

    val abstractFactory = AbstractFactory(guiFactory)

    abstractFactory.paint()
}

class AbstractFactory(private val guiFactory: GUIFactory) {
    private val button: Button by lazy { guiFactory.createButton() }
    private val checkbox: Checkbox by lazy { guiFactory.createCheckbox() }

    fun paint() {
        button.paint()
        checkbox.paint()
    }
}