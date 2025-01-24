package generative.singleton

class SingletonJava private constructor(val name: String) {
    companion object {
        private var instance: SingletonJava? = null

        fun getInstance(name: String): SingletonJava {
            if (instance == null) {
                instance = SingletonJava(name)
            }

            return instance!! //Can be applied here, because we guarantee that we create instance before
        }
    }
}