package com.longforus

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class TestPlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    project.logger.error "================自定义插件成功！=========="
    def android = project.extensions.findByType(AppExtension.class)
    android.registerTransform(new PreDexTransform(project))
  }
}