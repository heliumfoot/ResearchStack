package org.sagebionetworks.researchstack.backbone.task;


import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.sagebionetworks.researchstack.backbone.model.TaskModel;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/*
Tests whether step type "SurveyTextOnly" works in addition to "SurveyQuestion"
 */

@RunWith(MockitoJUnitRunner.class)
public class SmartSurveyTaskTest {

    List<TaskModel.StepModel> elements;
    TaskModel taskModel;
    Context mockContext;
    SmartSurveyTask testTask;

    @Before
    public void setUp() throws Exception

    {
        elements = new ArrayList<>();
        //elements.add("sup1");
        taskModel = new TaskModel();
        taskModel.identifier = "weight";
        taskModel.type = "Survey";
        taskModel.name = "Weight Measurement";
        TaskModel.StepModel oneElement = new TaskModel.StepModel();
        oneElement.identifier = "weightInitial";
        oneElement.type = "SurveyTextOnly";
        oneElement.prompt = "Consistent Time of Day";
        oneElement.promptDetail = "It is best to weigh yourself at a regular hour, every time. A good time can be early in the morning before eating";
        elements.add(oneElement);
        taskModel.elements = elements;
        mockContext = Mockito.mock(Context.class);
        testTask = null;
        testTask = new SmartSurveyTask(mockContext, taskModel);
    }

    @Test
    public void testWhetherSurveyTextOnlyWorks() {
        assertNotNull("SurveyTextOnly does not complete successfully", testTask);

    }

}


