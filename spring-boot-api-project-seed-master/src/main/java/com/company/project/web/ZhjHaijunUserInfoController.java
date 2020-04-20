package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ZhjHaijunUserInfo;
import com.company.project.service.ZhjHaijunUserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/20.
*/
@RestController
@RequestMapping("/zhj/haijun/user/info")
public class ZhjHaijunUserInfoController {
    @Resource
    private ZhjHaijunUserInfoService zhjHaijunUserInfoService;

    @PostMapping("/add")
    public Result add(ZhjHaijunUserInfo zhjHaijunUserInfo) {
        zhjHaijunUserInfoService.save(zhjHaijunUserInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        zhjHaijunUserInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ZhjHaijunUserInfo zhjHaijunUserInfo) {
        zhjHaijunUserInfoService.update(zhjHaijunUserInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ZhjHaijunUserInfo zhjHaijunUserInfo = zhjHaijunUserInfoService.findById(id);
        return ResultGenerator.genSuccessResult(zhjHaijunUserInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ZhjHaijunUserInfo> list = zhjHaijunUserInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
