package com.example.imdayapp


class BaseRobot {

    fun checkSplashIconIsVisible(): BaseRobot {
        UiAutomator.checkIdIsDisplayed(R.id.main_icon)
        return this
    }

    fun checkSplashDescriptionIsVisible(): BaseRobot {
        UiAutomator.checkIdIsDisplayed(R.id.main_title)
        return this
    }

    fun waitSplashEnd(): BaseRobot {
        UiAutomator.waitView(3000L)
        return this
    }

    fun checkNavigationIsOpened(): BaseRobot {
        UiAutomator.checkIdIsDisplayed(R.id.frameContent)
        return this
    }

    fun openDrawer(): BaseRobot {
        UiAutomator.openDrawerById(R.id.drawerLayout)
        return this
    }

    fun checkDrawerOptionsIsVisible(): BaseRobot {
        UiAutomator.checkTextIsDisplayed("Listagem")
        UiAutomator.checkTextIsDisplayed("Sobre")
        return this
    }

    fun checkListItensIsDisplayed(): BaseRobot {
        UiAutomator.checkTextIsDisplayed("Jessica")
        UiAutomator.checkTextIsDisplayed("Glauber")
        UiAutomator.checkTextIsDisplayed("Caio")
        return this
    }

    fun openAboutOption(): BaseRobot {
        UiAutomator.clickByText("Sobre")
        return this
    }

    fun checkAboutDescription(): BaseRobot {
        UiAutomator.checkTextIsDisplayed("Este app contém uma listagem de responsáveis por solucionar incidentes e suas respectivas datas")
        return this
    }

    fun openListOption(): BaseRobot {
        UiAutomator.clickByText("Listagem")
        return this
    }
}