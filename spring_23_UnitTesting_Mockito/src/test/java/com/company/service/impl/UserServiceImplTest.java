package com.company.service.impl;

import com.company.mapper.UserMapper;
import com.company.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)  //this is how you implement mockito class
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserServiceImpl userService;            // it doesnt work with interface, you need to have a class for that

    @Test
    void findByUserName_Test(){

        //// i am calling the real method inside the main , which is the method I wanted to test
        userService.findByUserName("harold@manager.com");

        // I am checking if this method is run or not
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com",false);

        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);


        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(10)).findByUserNameAndIsDeleted("harold@manager.com", false);

        InOrder inOrder = inOrder(userRepository, userMapper);

        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
        inOrder.verify(userMapper).convertToDto(null);




    }




}