package com.zwl.word.module.word.storer;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.AlarmModel;
import com.zwl.word.model.WordModel;
import com.zwl.word.module.alarm.IAlarmStorer;

import java.util.List;

/**
 * Created by hasee on 2017/6/26.
 */

public class GreenDaoDbStorer implements IWordStorer, IAlarmStorer {
    @Override
    public void getWordList(CommonCallback<List<WordModel>> commonCallback) {

    }

    @Override
    public void saveWord(WordModel wordModel) {

    }

    @Override
    public void getAlarmList(CommonCallback<List<AlarmModel>> commonCallback) {

    }

    @Override
    public void saveAlarm(AlarmModel alarmModel) {

    }
}
