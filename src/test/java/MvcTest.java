//import static org.mockito.Matchers.anyObject;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.senacor.oo.wheatherstation.rest.WeatherstationController;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.MediaType;
//import org.springframework.test.util.ReflectionTestUtils;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//public class MvcTest {
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//
//        MockitoAnnotations.initMocks(this);
//        WeatherstationController instance = new WeatherstationController();
//        ReflectionTestUtils.setField(instance, "WSGold", WSGold);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(instance).build();
//    }
//
//    @Test
//    public void test_Get_Base_Weatherstation_Features() throws Exception {
//
//        HttpServletRequest request = anyObject();
//        HttpServletResponse response = anyObject();
//        //when(socialContext.isSignedIn(request, response)).thenReturn(false);
//
//        MockHttpServletRequestBuilder getRequest = get("/wswhite/").accept(MediaType.ALL);
//
//        ResultActions results = mockMvc.perform(getRequest);
//
//        results.andExpect(status().isOk());
//        results.andExpect(view().name("/links"));
//    }
//}