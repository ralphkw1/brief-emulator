package com.github.ralphkw1.briefemulator.services

import com.intellij.openapi.project.Project
import com.github.ralphkw1.briefemulator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
