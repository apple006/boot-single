package cn.amos.boot.controller;

import cn.amos.boot.dao.entity.UserEntity;
import cn.amos.boot.dao.mappers.UserMapper;
import cn.amos.boot.request.PageModel;
import cn.amos.boot.response.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DaoyuanWang
 * @version V1.0.0
 * @apiNote 用户相关
 * @date 2018/1/15
 */
@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserMapper userMapper;

    @RequestMapping("page")
    public String pageApply(@RequestParam(value = "page", required = false) Integer page,
                            @RequestParam(value = "size", required = false) Integer size,
                            Model model) {
        if (page == null || size == null) {
            return "parameterError";
        }
        PageModel pageModel = new PageModel();
        pageModel.setPage(page);
        pageModel.setRows(size);
        List<UserEntity> applyEntities = userMapper.selectByPage(pageModel);
        List<UserEntity> applyEntitiesAll = userMapper.selectAll();
        PageResult<UserEntity> pageResult = new PageResult<>();
        pageResult.setPage(page);
        pageResult.setSize(size);
        // 总记录数量
        pageResult.setTotal(applyEntitiesAll.size());
        // 当前页记录数量
        pageResult.setNumber(applyEntities.size());
        // 记录数据列表
        pageResult.setRows(applyEntities);
        // 第一个 || 最后一个
        pageResult.setTotalPages();
        pageResult.setFirst();
        pageResult.setLast();

        model.addAttribute("pageResult", pageResult);
        return "user";
    }
}
