package com.example.deleting.bookticketcgv.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.deleting.bookticketcgv.R;
import com.example.deleting.bookticketcgv.utils.Utils;
import com.gigamole.infinitecycleviewpager.VerticalInfiniteCycleViewPager;

import static com.example.deleting.bookticketcgv.utils.Utils.setupItem;


public class HorizontalPagerAdapter extends PagerAdapter {

    private final Utils.LibraryObject[] LIBRARIES = new Utils.LibraryObject[]{
            new Utils.LibraryObject(
                    R.drawable.ic_conan,""
//                    "Thám Tử Lừng Danh Conan"
            ),
            new Utils.LibraryObject(
                    R.drawable.ic_emchua18,""
//                    "Em Chua 18"
            ),
            new Utils.LibraryObject(
                    R.drawable.ic_fats,""
//                    "Fast & Furious 8"
            ),
            new Utils.LibraryObject(
                    R.drawable.ic_nhoctrum,""
//                    "Nhóc Trùm"
            ),
            new Utils.LibraryObject(
                    R.drawable.ic_tronthoat,""
//                    "Trốn Thoát"
            ),
    };

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private boolean mIsTwoWay;

    public HorizontalPagerAdapter(final Context context, final boolean isTwoWay) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mIsTwoWay = isTwoWay;
    }

    @Override
    public int getCount() {
        return mIsTwoWay ? 6 : LIBRARIES.length;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view;
        if (mIsTwoWay) {
            view = mLayoutInflater.inflate(R.layout.two_way_item, container, false);

            final VerticalInfiniteCycleViewPager verticalInfiniteCycleViewPager =
                    (VerticalInfiniteCycleViewPager) view.findViewById(R.id.vicvp);
//            verticalInfiniteCycleViewPager.setAdapter(
//                    new VerticalPagerAdapter(mContext)
//            );
            verticalInfiniteCycleViewPager.setCurrentItem(position);
        } else {
            view = mLayoutInflater.inflate(R.layout.item, container, false);
            setupItem(view, LIBRARIES[position]);
        }

        container.addView(view);
        return view;
    }



    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }
}
