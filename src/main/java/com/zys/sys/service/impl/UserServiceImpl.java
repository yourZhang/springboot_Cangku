package com.zys.sys.service.impl;

import com.zys.sys.domain.User;
import com.zys.sys.mapper.UserMapper;
import com.zys.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小张666
 * @since 2019-12-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
