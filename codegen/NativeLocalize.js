// @flow
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
    +getConstants: () => {|
        initialConstants: Object
    |},
    +addListener: (eventName: string) => void,
    +removeListeners: (count: number) => void
}

export default (TurboModuleRegistry.get<Spec>(
'RNLocalize'
): ?Spec);