/*
* Copyright (c)  2018
* All rights reserved.
* 2018-08-21 09:40:34
*/
package com.ueboot.shiro.repository.role.impl;

import com.ueboot.shiro.entity.Role;
import org.springframework.stereotype.Repository;
import com.ueboot.core.jpa.repository.DefaultJpaRepository;
import com.ueboot.shiro.repository.role.RoleBaseRepository;
import lombok.extern.slf4j.Slf4j;

/**
* 自定义接口实现类，可以使用父类DefaultJpaRepository当中的find(),findBySql等方法实现自定义的StringQuery查询
* 相关使用示例，参见文档http://docs.ueboot.com
* Created on 2018-08-21 09:40:34
* @author yangkui
* @since 2.1.0 by ueboot-generator
*/
@Slf4j
@Repository
public class RoleRepositoryImpl extends DefaultJpaRepository<Role,Long> implements RoleBaseRepository {

}
