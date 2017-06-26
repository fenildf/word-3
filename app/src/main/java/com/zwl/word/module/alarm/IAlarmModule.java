package com.zwl.word.module.alarm;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.AlarmModel;

/**
 * Created by hasee on 2017/6/26.
 */

public interface IAlarmModule {

    void setAlarm(AlarmModel alarmModel, boolean open, CommonCallback<Void> commonCallback);
}
