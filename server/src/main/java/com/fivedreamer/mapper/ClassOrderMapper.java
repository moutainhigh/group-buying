package com.fivedreamer.mapper;

import com.fivedreamer.model.CommonOrder;

import java.util.List;

/**
 * Created by Jiayiwu on 17/4/29.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public interface ClassOrderMapper {

    /**
     * 用于正在进行拼单的查询
     */
    public List<CommonOrder> getClassOrderNowByUserID(int id);

    /**
     * 用于正在已经拼单成功的查询
     */
    public List<CommonOrder> getClassOrderSuccessByUserID(int id);

    /**
     * 通过评论查找参与过的订单
     */
    public List<CommonOrder> getClassOrderByComments(int id);
}
