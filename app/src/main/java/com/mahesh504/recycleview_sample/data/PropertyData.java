package com.mahesh504.recycleview_sample.data;

import com.mahesh504.recycleview_sample.model.PropertyModel;

import java.util.ArrayList;
import java.util.List;

public class PropertyData {
    public static List<PropertyModel> getPropertyData() {

        List<PropertyModel> pro_list = new ArrayList<>();
        pro_list.add(new PropertyModel(1, "pro_1", "pro_1_ads", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"));
        pro_list.add(new PropertyModel(2, "pro_2", "pro_2_ads", "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"));
        pro_list.add(new PropertyModel(3, "pro_3", "pro_3_ads", "https://homepages.cae.wisc.edu/~ece533/images/baboon.png"));
        pro_list.add(new PropertyModel(4, "pro_4", "pro_4_ads", "https://homepages.cae.wisc.edu/~ece533/images/barbara.png"));
        pro_list.add(new PropertyModel(5, "pro_5", "pro_5_ads", "https://homepages.cae.wisc.edu/~ece533/images/boat.png"));

        pro_list.add(new PropertyModel(6, "pro_6", "pro_6_ads", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"));
        pro_list.add(new PropertyModel(7, "pro_7", "pro_7_ads", "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"));
        pro_list.add(new PropertyModel(8, "pro_8", "pro_8_ads", "https://homepages.cae.wisc.edu/~ece533/images/baboon.png"));
        pro_list.add(new PropertyModel(9, "pro_9", "pro_9_ads", "https://homepages.cae.wisc.edu/~ece533/images/barbara.png"));
        pro_list.add(new PropertyModel(10, "pro_10", "pro_10_ads", "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"));

        pro_list.add(new PropertyModel(11, "pro_11", "pro_11_ads", "https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"));
        pro_list.add(new PropertyModel(12, "pro_12", "pro_12_ads", "https://homepages.cae.wisc.edu/~ece533/images/baboon.png"));
        pro_list.add(new PropertyModel(13, "pro_13", "pro_13_ads", "https://homepages.cae.wisc.edu/~ece533/images/barbara.png"));
        pro_list.add(new PropertyModel(14, "pro_14", "pro_14_ads", "https://homepages.cae.wisc.edu/~ece533/images/boat.png"));
        pro_list.add(new PropertyModel(15, "pro_15", "pro_15_ads", "https://homepages.cae.wisc.edu/~ece533/images/cat.png"));

        return pro_list;

    }

}
