package com.fivedreamer.controller;

import com.fivedreamer.config.MessageInfo;
import com.fivedreamer.model.User;
import com.fivedreamer.service.CarOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Jiayiwu on 17/4/26.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
@Controller
public class CarOrderController {


    @Resource
    CarOrderService carOrderService;

    /**
     * @param isMore 当isMore为False时,默认返回7个方向.当isMore为True时,返回系统已存在的所有方向
     * @return  MessageInfo (true 表示返回方向成功,Object为String[]类型,存储的是推荐的方向. False表示返回失败,失败原因存储在Reason中)
     */
    @RequestMapping("/car/direction/list")
    @ResponseBody
    public MessageInfo getDirection(boolean isMore){
        MessageInfo messageInfo = carOrderService.getAllDirection();
        if (messageInfo.isResult()){
            if (!isMore) {
                String[] result = new String[7];
                String[] tem = (String[]) messageInfo.getObject();
                for (int i = 0;i<tem.length;i++){
                    result[i] = tem[i];
                }
                messageInfo.setObject(result);
                return messageInfo;
            }else
                return messageInfo;

        }
        return messageInfo;
    }


    /**
     * @param direction 检索的方向,由上面getDirection提供的方向
     * @return MessageInfo (true 表示返回该方向的订单成功,Object为List<CarOrderListVO>类型,存储的在该方向上的订单. False表示返回失败,失败原因存储在Reason中)
     */
    @RequestMapping("/car/direction/index")
    @ResponseBody
    public MessageInfo getDirectionList(String direction){
        return carOrderService.getDirectionList(direction);
    }

    /**
     * @return MessageInfo (true 表示返回该方向的订单成功,Object为List<List<CarOrderListVO>>类型,存储的在该方向上的订单. False表示返回失败,失败原因存储在Reason中)
     */
    @RequestMapping("/car/sort/list")
    @ResponseBody
    public MessageInfo getDirectionSortList(){
        return carOrderService.getDirectionList();
    }

    @RequestMapping("/car/order/index")
    @ResponseBody
    /**
     * @param id 订单编号
     * @return MessageInfo (true 表示返回具体的订单成功,Object为CarOrderDetailVO类型,存储的该订单的详细信息. False表示返回失败,失败原因存储在Reason中)
     */
    public MessageInfo getCarOrderDetail(int id){
        return carOrderService.getCarOrderDetail(id);
    }

    @RequestMapping("/car/order/add")
    @ResponseBody
    /**
     * @param session
     * @param title 标题
     * @param content 拼单内容
     * @param location 地址
     * @param direction 方向
     * @param imgUrl 发布图片的URL
     * @return MessageInfo (true 表示添加订单成功. False表示添加失败,失败原因存储在Reason中)
     */
    public MessageInfo addCarOrder(HttpSession session,String title,String content,String location,String direction,String imgUrl){
        return carOrderService.addCarOrder(((User)session.getAttribute("user")).getId(),title,content,location,direction,imgUrl.split(" "));
    }


    @RequestMapping("/car/order/modify")
    @ResponseBody
    /**
     * @param id 要修改帖子的ID
     * @param title 标题
     * @param content 拼单内容
     * @param location 地址
     * @param direction 方向
     * @param imgUrl 发布图片的URL
     * @return MessageInfo (true 表示修改订单成功. False表示修改失败,失败原因存储在Reason中)
     */
    public MessageInfo modifyOrder(int id,String title,String content,String location,String direction,String imgUrl){
        return carOrderService.modifyOrder(id,title,content,location,direction,imgUrl.split(" "));
    }

    @RequestMapping("/car/order/list")
    @ResponseBody
    /**
     * @return MessageInfo (true 表示返回成功.返回的Object对象为List<CarOrderListVO>,根据发布时间排序后返回该对象. False表示返回失败,失败原因存储在Reason中)
     */
    public MessageInfo getRecommendCarOrderList(){
        return carOrderService.getRecommendCarOrderList();
    }


    @RequestMapping("/car/order/success")
    @ResponseBody
    /**
     * @param id 订单编号
     * @return MessageInfo (true 表示更改订单状态成功,订单变为拼团成功. False表示状态改变失败,失败原因存储在Reason中)
     */
    public MessageInfo successOrder(int id){
        return carOrderService.successOrder(id);
    }

    @RequestMapping("/car/order/delete")
    @ResponseBody
    /**
     * @param id 订单编号
     * @return MessageInfo (true 表示更改订单状态成功,订单被删除. False表示状态改变失败,失败原因存储在Reason中)
     */
    public MessageInfo deleteOrder(int id){
        return carOrderService.deleteOrder(id);
    }
}
