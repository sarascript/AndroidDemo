package es.sarascript.navigationdemo.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModelDrawer extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModelDrawer() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}