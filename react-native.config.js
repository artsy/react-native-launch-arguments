module.exports = {
  dependency: {
    platforms: {
      android: {
        sourceDir: '../android/src/main/java/com/reactnativelauncharguments',
        packageImportPath: 'import com.reactnativelauncharguments.LaunchArgumentsPackage;',
        componentDescriptors: null,
        cmakeListsPath: null,
      },
      ios: {
        libraryFolder: '../ios',
        sharedLibraries: [],
        project: 'LaunchArguments.xcodeproj',
        podspecPath: '../react-native-launch-arguments.podspec',
      },
    },
  },
};
