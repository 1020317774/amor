package com.wyc.elegant.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyc.elegant.admin.model.entity.TbRolePermission;
import org.mapstruct.Mapper;

/**
 * 角色权限
 *
 * @author Knox 2020/11/7
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<TbRolePermission> {
}
