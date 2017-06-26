package com.zwl.word.module.word;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.WordModel;

/**
 * Created by hasee on 2017/6/26.
 */

public interface IWordModule {
    void searchWord(String wordName, CommonCallback<WordModel> commonCallback);
}
