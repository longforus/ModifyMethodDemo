@rem 只有在clean之后才会进入断点
call gradlew clean
call gradlew assembleDebug -Dorg.gradle.daemon=false -Dorg.gradle.debug=true
pause>nul