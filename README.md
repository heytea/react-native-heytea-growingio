
# react-native-heytea-growingio

## Getting started

`$ npm install react-native-heytea-growingio --save`

### Mostly automatic installation

`$ react-native link react-native-heytea-growingio`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-heytea-growingio` and add `RNReactNativeHeyteaGrowingio.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeHeyteaGrowingio.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.heytea.growingio.RNReactNativeHeyteaGrowingioPackage;` to the imports at the top of the file
  - Add `new RNReactNativeHeyteaGrowingioPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-heytea-growingio'
  	project(':react-native-react-native-heytea-growingio').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-heytea-growingio/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-heytea-growingio')
  	```
