package com.tensquare.friend.dao;

import com.tensquare.friend.poji.Friend;
import com.tensquare.friend.poji.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface NoFriendDao extends JpaRepository<NoFriend,String> {

    public   NoFriend  findByUseridAndFriendid(String userid, String friendid);


}
