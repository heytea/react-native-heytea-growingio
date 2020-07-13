import { NativeModules, DeviceEventEmitter } from 'react-native';

const { GrowingIO } = NativeModules;


export default class HeyteaGrowingIO {
    //自定义事件
    static track(eventId, eventLevelVariable) {
        GrowingIO.track(eventId, eventLevelVariable);
    };


    //自定义事件 并设置number 标记  已废弃
    static trackWithNumber(eventId, number, eventLevelVariable) {
        GrowingIO.trackWithNumber(eventId, number, eventLevelVariable);

    };

    //设置转化变量
    static setEvar(conversionVariables) {
        GrowingIO.setEvar(conversionVariables)
    };

    //设置用户变量
    static setPeopleVariable(peopleVariables) {
        GrowingIO.setEvar(peopleVariables)
    };


    //设置登录用户ID
    static setUserId(userId) {
        GrowingIO.setUserId(userId)
    };


    static clearUserId() {
        GrowingIO.clearUserId()
    };


    //设置访问用户变量
    static setVisitor(params) {
        GrowingIO.setVisitor(params)
    };


    //页面
    static setPageVariable(pageName, params) {
        GrowingIO.setPageVariable(params)
    };

    static setUser(params) {};

}


module.exports = HeyteaGrowingIO


