package com.fivedreamer.vo;

import com.fivedreamer.model.CommonOrder;
import com.fivedreamer.utils.DataUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jiayiwu on 17/4/26.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class MailOrderDetailVO {
    //订单号
    private int id;
    //订单发起人ID
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

    //拼邮类型
    private String type;
    //留言
    private List<CommentVO> comments = new LinkedList<CommentVO>();


    public MailOrderDetailVO() {
    }

    public MailOrderDetailVO(CommonOrder commonOrder) {
        this.userid = commonOrder.getUserid();
        this.id = commonOrder.getId();
        this.username = commonOrder.getUsername();
        this.usericonurl = commonOrder.getUsericonurl();
        this.title = commonOrder.getTitle();
        this.content = commonOrder.getContent();
        this.location = commonOrder.getLocation();
        this.time = commonOrder.getTime();
        switch (commonOrder.getType()){
            case 0:
                this.type = "日本";
                break;
            case 1:
                this.type = "韩国";
                break;
            case 2:
                this.type = "美国";
                break;
            case 3:
                this.type = "欧洲";
                break;
            case 4:
                this.type = "澳洲";
                break;
            case 5:
                this.type = "港澳台泰";
                break;
            case 6:
                this.type = "其他地区";
                break;
            case 7:
                this.type = "网店拼邮";
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
