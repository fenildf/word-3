package com.zwl.word.module.word.storer;

import com.zwl.mylibrary.base.CommonCallback;
import com.zwl.word.model.WordModel;

import java.util.List;

/**
 * Created by hasee on 2017/6/26.
 */

public interface IWordStorer {
    void getWordList(CommonCallback<List<WordModel>> commonCallback);

    void saveWord(WordModel wordModel);
}
