# ToastApp
toast lib

>Step 1. Add the JitPack repository to your build file

... Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ...


>Step 2. Add the dependency

...gradle app's

	dependencies {
	        implementation 'com.github.dinesh4manit:ToastApp:Tag'
	}
  ...