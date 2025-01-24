package generative.abstractfactory.factory

import generative.abstractfactory.button.Button
import generative.abstractfactory.checkbox.Checkbox

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}