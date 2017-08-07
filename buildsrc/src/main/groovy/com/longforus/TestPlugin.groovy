package com.longforus

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 参考文章:http://blog.csdn.net/u010386612/article/details/51131642
 */
public class TestPlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    project.logger.error "================自定义插件成功！=========="
    def android = project.extensions.findByType(AppExtension.class)
    android.registerTransform(new PreDexTransform(project))//调用自定义的transform进行
  }
}