package com.zwl.word.module.alarm;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.AlarmModel;

import java.util.List;

/**
 * Created by hasee on 2017/6/26.
 */

public interface IAlarmStorer {
    void getAlarmList(CommonCallback<List<AlarmModel>> commonCallback);

    void saveAlarm(AlarmModel alarmModel);
}
