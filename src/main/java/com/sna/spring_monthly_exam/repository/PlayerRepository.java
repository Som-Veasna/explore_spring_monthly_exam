package com.sna.spring_monthly_exam.repository;

import com.sna.spring_monthly_exam.model.entity.Player;
import com.sna.spring_monthly_exam.model.request.PlayerRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PlayerRepository {
    @Results(id = "PlayerMapper",value = {
            @Result(property = "playerId",column = "player_id"),
            @Result(property = "playerName",column = "player_name"),
    }
    )
    @Select("""
select * from player
""")
    List<Player> getAllPlayers();
    @Select("""
select * from player where player_id=#{playerId}
""")
    @ResultMap("PlayerMapper")
    Player getPlayerById(Integer playerId);
    @Select("""
insert into player(player_name,salary,team_id) values (#{re.playerName},#{re.salary},#{re.teamId}) returning *;
""")
    @ResultMap("PlayerMapper")
    Player CreatePlayer(@Param("re") PlayerRequest playerRequest);



}
