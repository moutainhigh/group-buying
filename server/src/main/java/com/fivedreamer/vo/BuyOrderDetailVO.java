package com.fivedreamer.vo;

import com.fivedreamer.model.CommonOrder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jiayiwu on 17/4/26.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class BuyOrderDetailVO {
    //订单号
    private int id;
    //订单所属人ID
    private int userid;
    //订单发起人昵称
    private String username;
    //订单发起人头像
    private String usericonurl;
    //订单主题
    private String title;
    //订单内容
    private String content;
    //订单发布者位置
    private String location;

    private long time;

    //订单详细图片信息
    private String[] imgPath;

    //拼团类型
    private String type;
    //留言
    private List<CommentVO> comments = new LinkedList<CommentVO>();


    public BuyOrderDetailVO(CommonOrder commonOrder) {
        this.id = commonOrder.getId();
        this.userid = commonOrder.getUserid();
        this.username = commonOrder.getUsername();
        this.usericonurl = commonOrder.getUsericonurl();
        this.title = commonOrder.getTitle();
        this.content = commonOrder.getContent();
        this.location = commonOrder.getLocation();
        this.time = commonOrder.getTime();
        switch (commonOrder.getType()){
            case 0:
                this.type = "吃喝";
                break;
            case 1:
                this.type = "玩乐";
                break;
            case 2:
                this.type = "服饰";
                break;
            case 3:
                this.type = "其他";
                break;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsericonurl() {
        return usericonurl;
    }

    public void setUsericonurl(String usericonurl) {
        this.usericonurl = usericonurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public void setComments(List<CommentVO> comments) {
        this.comments = comments;
    }

    public String[] getImgPath() {
        return imgPath;
    }

    public void setImgPath(String[] imgPath) {
        this.imgPath = imgPath;
    }


}
