package com.JPA_study.Mockito;


import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

/*
    Mockito 어노테이션 사용
@Mock
@MockBean
@Spy
@SpyBean
@InjectMocks

 */
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    // Mockito 주석 활성화
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();



    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);

        mockList.add("one");
        Mockito.verify(mockList).add("one");
        assertEquals(0, mockList.size());

        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

    @Mock
    List<String> mockedList;

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100);
        assertEquals(100, mockedList.size());
    }

    @Test
    public void whenNotUseSpyAnnotation_thenCorrect() {
        List<String> spyList = Mockito.spy(new ArrayList<String>());

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }


    @Mock
    List mockedListcap;

    @Captor
    ArgumentCaptor argCaptor;

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        mockedListcap.add("one");
        Mockito.verify(mockedList).add(argCaptor.capture());

        assertEquals("one", argCaptor.getValue());
    }
}
