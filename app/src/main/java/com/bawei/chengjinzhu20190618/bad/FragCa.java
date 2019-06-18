package com.bawei.chengjinzhu20190618.bad;

import android.support.v4.app.Fragment;

import com.jph.takephoto.app.TakePhotoFragment;
import com.jph.takephoto.model.TImage;
import com.jph.takephoto.model.TResult;

/**
 * Author:程金柱
 * Date:2019/6/18 21:16
 * Description：
 */

public class FragCa extends TakePhotoFragment {
    @Override
    public void takeSuccess(TResult result) {
        super.takeSuccess(result);
        TImage image = result.getImage();
    }
}
