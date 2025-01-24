package generative.factorymethod.dialog

import generative.factorymethod.button.Button

abstract class Dialog {
    private val button: Button by lazy { createButton() }

    fun render() {
        button.render()
    }

    fun clickButton() {
        button.onClick()
    }

    protected abstract fun createButton(): Button
}