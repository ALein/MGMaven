package whoszus.model.messageModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Message implements Serializable{
    private String uuid; //����
    private Date date;  //����ʱ��
    private String detail;  //��������
    private int uid;
    private int anonymous;
}
