package com.fivedreamer.vo;

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
    //订单本地时间表述 如2017-04-26 13:26:16
    private String timeformate;

    //拼团类型
    private String type;
    //留言
    private List<CommentVO> comments = new LinkedList<CommentVO>();

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

    public String getTimeformate() {
        return timeformate;
    }

    public void setTimeformate(String timeformate) {
        this.timeformate = timeformate;
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
}
