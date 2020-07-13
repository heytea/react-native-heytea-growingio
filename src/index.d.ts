declare module '@heytea/react-native-heytea-growingio' {
    export function track(eventId: string, eventLevelVariable: object): void;

    export function trackWithNumber(eventId: string, number: number, eventLevelVariable: object): void;

    export function setEvar(conversionVariables: object): void;

    export function setPeopleVariable(peopleVariables: object): void;

    export function setUserId(userId: string): void;

    export function clearUserId(): void;

    export function setVisitor(readableMap: object): void;

    export function setPageVariable(pageName, params): void;

    export function setUser(params): void;

}
