package com.github.bobbyz007.intelllijplatformpluginsample.services

import com.intellij.openapi.project.Project
import com.github.bobbyz007.intelllijplatformpluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
