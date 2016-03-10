package com.maoxian.portal.service.impl.task;

import com.maoxian.portal.service.task.TaskLobbyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hui on 2016/3/8.
 */
@Service("taskLobbyServiceImpl")
public class TaskLobbyServiceImpl implements TaskLobbyService {
    @Override
    public List<String> queryTack() {
        List<String> list = new ArrayList<String>();
        System.out.println("查询任务分类!!!");
        return list;
    }
}
