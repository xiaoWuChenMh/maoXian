package com.maoxian.portal.controller.task;

import com.maoxian.portal.service.task.TaskLobbyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by hui on 2016/3/8.
 */
@Controller
@RequestMapping("/tasklobby")
public class TaskLobby {

    @Resource(name="taskLobbyServiceImpl")
    public TaskLobbyService taskLobbyService;

    @RequestMapping("/intolobby")
    public String intoLobby(Model model){
        System.out.println("进入任务大厅");
        taskLobbyService.queryTack();
        return "one.ftl";
    }
}
