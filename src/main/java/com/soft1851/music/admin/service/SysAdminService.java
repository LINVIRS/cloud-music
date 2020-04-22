package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.common.Result;
import com.soft1851.music.admin.dto.LoginDto;
import com.soft1851.music.admin.entity.SysAdmin;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wl
 * @since 2020-04-21
 */
public interface SysAdminService extends IService<SysAdmin> {
    /**
     * 登陆接口
     *
     * @param loginDto
     * @return
     */
    public Result login(LoginDto loginDto);
}
