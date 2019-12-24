package com.yourena.gmall.user.service.impl;

import com.yourena.gmall.bean.UmsMember;
import com.yourena.gmall.bean.UmsMemberReceiveAddress;
import com.yourena.gmall.service.UserService;
import com.yourena.gmall.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return null;
    }

    @Override
    public List<UmsMember> getUmsMemberById(String id) {
        return null;
    }

    @Override
    public void addUmsMember(UmsMember umsMember) {

    }

    @Override
    public void deletUmsMemberById(String Id) {

    }

    @Override
    public void updataUmsMember(UmsMember umsMember) {

    }

    @Override
    public void addUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {

    }

    @Override
    public void deletUmsMemberReceiveAddressById(String Id) {

    }

    @Override
    public void updataUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress1) {

    }

    @Override
    public UmsMember login(UmsMember umsMember) {
        return null;
    }

    @Override
    public void addUserToken(String token, String memberId) {

    }

    @Override
    public UmsMember addOauthUser(UmsMember umsMember) {
        return null;
    }

    @Override
    public UmsMember checkOauthUser(UmsMember umsCheck) {
        return null;
    }

    @Override
    public String getSourceType(String memberId) {
        return null;
    }

    @Override
    public UmsMemberReceiveAddress getReceiveAddressByReceiveAddressId(String receiveAddressId) {
        return null;
    }
}
