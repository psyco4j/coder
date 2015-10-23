package test.dal.builder;

import test.dal.bean.UserDetail;
import test.dal.dto.UserDetailDTO;
/**
 * Created by psyco on 2015/19/24-02:10:15.
 */
public class UserDetailDTOBuilder{
    public static UserDetailDTO toUserDetailDTO(UserDetail userDetail){
        UserDetailDTO re = new UserDetailDTO();
        re.setId(userDetail.getId());
        re.setUserId(userDetail.getUserId());
        return re;
    }
    public static UserDetail toUserDetail(UserDetailDTO userDetailDTO){
        UserDetail re = new UserDetail();
        re.setId(userDetailDTO.getId());
        re.setUserId(userDetailDTO.getUserId());
        return re;
    }
}