package whoszus.model.blogModel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Blog implements Serializable{
    private String uuid; //����id
    private Date date;  //����ʱ��
    private String detail;  //����
    private int uid;    //�����������user id
    private int anonymous;  //�Ƿ�����
    private String theme;   //������
}
