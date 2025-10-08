import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  getConstants(): {
    value: { [key: string]: string };
  };
}

export default TurboModuleRegistry.getEnforcing<Spec>('LaunchArguments');
