module.exports = {
  dependency: {
    platforms: {
      android: {
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