package com.alurkerja.pengajuancuti;

import com.alurkerja.DemoApplication;
import com.alurkerja.authentication.AuthService;
import com.alurkerja.authentication.request.RegisterRequest;
import com.alurkerja.crud.user.User;
import com.alurkerja.crud.user.UserService;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@SpringBootTest(classes = DemoApplication.class)
@TestPropertySource(
        locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
class PengajuanCutiControllerTest {

    @Autowired
    private MockMvc mockMvc;

//     Use Faker if needed
//     Faker faker = new Faker();


//     Process Instance 
    
    public String createPengajuanCuti () throws Exception {
            
        String token = ""; // Actor Torken

        String jsonPayload = ""; // Update Jsonpayload 

        MvcResult result = this.mockMvc
                .perform(MockMvcRequestBuilders.post("/bpmn/PengajuanCuti").header("Content-Type", "application/json")
                        .content(
                                jsonPayload
                        )
                        .header("Authorization", "Bearer " + token))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        LinkedTreeMap<String, Object> res = new Gson().fromJson(result.getResponse().getContentAsString(), LinkedTreeMap.class);
        LinkedTreeMap<String, Object>  res2 = (LinkedTreeMap<String, Object>) res.get("data");
        LinkedTreeMap<String, Object>  res3 = (LinkedTreeMap<String, Object>) res2.get("object");
        return (String) res3.get("id");
    }

    


//     User Task
    
    public void doReviewcuti (String  processIsntanceId ) throws Exception {
        

        String token = ""; // Actor Torken

        String jsonPayload = ""; // Update Jsonpayload 

        this.mockMvc
                .perform(MockMvcRequestBuilders.post("/bpmn/PengajuanCuti/ReviewCuti/" + processIsntanceId ).header("Content-Type", "application/json")
                        .content(
                                jsonPayload
                        )
                        .header("Authorization", "Bearer " + token))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

        

//     Test Example 
//     @Test
//     void doLeaveandpermisson() throws Exception {
//         String processInstanceId =  createReimbursment();

//         approveByAdmin(processInstanceId , "yes");
//        uploadBukti(processInstanceId);

//     }

}