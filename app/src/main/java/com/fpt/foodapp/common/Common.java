package com.fpt.foodapp.common;

import com.fpt.foodapp.dto.Request;
import com.fpt.foodapp.dto.User;

public class Common {
    //Lấy tên đăng nhập;
    public static User user;
    public static Request request;
    public static final String DELETE = "Delete";
    public static final String DANHAN = "Đã Nhận Hàng";

    public static String coverStatus(String status) {
        if (status.equals("0")) {
            return "Chờ xác nhận";
        } else if (status.equals("2")) {
            return "Đã nhận hàng";
        } else if (status.equals("1")) {
            return "Đang Giao";
        } else {
            return "Đã huỷ";
        }
    }


}
