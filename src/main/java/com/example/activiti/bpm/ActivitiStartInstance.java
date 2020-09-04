package com.example.activiti.bpm;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * @ClassName ActivitiStartInstance
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/9/4
 * @Version V1.0
 **/
public class ActivitiStartInstance {
    public static void main(String[] args) {
        //得到对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //得到实例
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();
        //创建
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess_1");
        //输出
        System.out.println("流程部署id"+processInstance.getDeploymentId());
        System.out.println("流程实例id"+processInstance.getId());
        System.out.println("活动id"+processInstance.getActivityId());
    }
}
