object BlueEnvironment : AppEnvironment {
    override fun uat(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Uat Blue",
            APPLICATION_ID = "\"com.freeman.blueuat\"",
        )
    }

    override fun dev(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Dev Blue",
            APPLICATION_ID = "\"com.freeman.bluedev\"",
        )
    }

    override fun pd(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "$pd Blue",
            APPLICATION_ID = "\"com.freeman.bluedev\"",
        )
    }

    override fun prod(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Blue",
            APPLICATION_ID = "\"com.freeman.blue\"",
        )
    }

    override fun preprod(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Preprod Blue",
            APPLICATION_ID = "\"com.freeman.blueuat\"",
        )
    }
}

object PinkEnvironment : AppEnvironment {
    override fun uat(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Uat Pink",
            APPLICATION_ID = "\"com.freeman.pink.uat\"",
        )
    }

    override fun dev(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Dev Pink",
            APPLICATION_ID = "\"com.freeman.pink.dev\"",
        )
    }

    override fun pd(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "$pd Pink",
            APPLICATION_ID = "\"com.freeman.pink.dev\"",
        )
    }

    override fun prod(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Pink",
            APPLICATION_ID = "\"com.freeman.pink\"",
        )
    }

    override fun preprod(): BaseEnvironment {
        return BaseEnvironment(
            APP_NAME = "Preprod Pink",
            APPLICATION_ID = "\"com.freeman.pink.preprod\"",
        )
    }
}

data class BaseEnvironment(
    val APP_NAME: String,
    val APPLICATION_ID: String,
)

interface AppEnvironment {
    fun uat(): BaseEnvironment
    fun dev(): BaseEnvironment
    fun prod(): BaseEnvironment
    fun preprod(): BaseEnvironment
    fun pd(): BaseEnvironment
}

const val pd = "pd1"