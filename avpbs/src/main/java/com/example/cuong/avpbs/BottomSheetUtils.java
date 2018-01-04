package com.example.cuong.avpbs;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.example.cuong.avpbs.AnchorViewPagerBottomSheet;

/**
 * Created by cuong on 10/5/2017.
 */

public final class BottomSheetUtils {
    public static void setupViewPager(ViewPager viewPager,View BottomSheet) {

        viewPager.addOnPageChangeListener(new BottomSheetViewPagerListener(viewPager, BottomSheet));
    }

    private static class BottomSheetViewPagerListener extends ViewPager.SimpleOnPageChangeListener {
        private final ViewPager viewPager;
        private final AnchorViewPagerBottomSheet<View> behavior;

        private BottomSheetViewPagerListener(ViewPager viewPager, View bottomSheetParent) {
            this.viewPager = viewPager;
            this.behavior = AnchorViewPagerBottomSheet.from(bottomSheetParent);
        }

        @Override
        public void onPageSelected(int position) {
            viewPager.post(new Runnable() {
                @Override
                public void run() {
                    behavior.invalidateScrollingChild();
                }
            });
        }
    }


}
