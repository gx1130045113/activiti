package com.example.activiti.bpm;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * @ClassName ActivitiDeployment
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/9/4
 * @Version V1.0
 **/
public class ActivitiDeployment {
    public static void main(String[] args) {
        //得到对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //得到实例
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();

        //进行部署
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("diagram/aaa.bpmn")
                .addClasspathResource("diagram/aaa.png")
                .name("请假流程")
                .deploy();

        //输出信息
        System.out.println(deployment.getName());
        System.out.println(deployment.getId());
    }
}
