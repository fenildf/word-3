package com.zwl.word.business;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.AlarmModel;
import com.zwl.word.model.WordModel;

import java.util.List;

/**
 * Created by hasee on 2017/6/26.
 */

public interface IWordBusiness {
    void getRecentlyWordList(CommonCallback<List<WordModel>> commonCallback);

    void searchWord(String wordName, CommonCallback<WordModel> commonCallback);

    void getAlarmList(CommonCallback<List<AlarmModel>> alarmModelCommonCallback);

    void setAlarm(AlarmModel alarmModel, boolean open, CommonCallback<Void> commonCallback);

    void setHomeWordListChangedListener(HomeWordListChangedListener homeWordListChangedListener);

    interface HomeWordListChangedListener {
        void onWordListChanged();
    }
}
