package com.sna.spring_monthly_exam.repository;

import com.sna.spring_monthly_exam.model.entity.Coach;
import com.sna.spring_monthly_exam.model.entity.Player;
import com.sna.spring_monthly_exam.model.entity.Team;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeamRepository {

    @Results(id = "TeamMapper",value = {
            @Result(property = "teamId",column = "team_id"),
            @Result(property = "teamName",column = "team_name"),
            @Result(property = "coach",column = "coach_id",
                    one = @One(select = "getCoachById")
            ),
            @Result(property = "players",column = "team_id",
                    many=@Many(select = "getAllPlayerByTeamId")
            )
    }
    )
    @Select("""
select * from team
""")
    List<Team> GetAllTeam();
    @Results(id = "PlayerMapper",value = {
            @Result(property = "playerId",column = "player_id"),
            @Result(property = "playerName",column = "player_name"),
    }
    )
    @Select("""
select * from player where team_id = #{teamId}
""")
    List<Player> getAllPlayerByTeamId(Integer teamId);
    @Results({
            @Result(property = "coachId", column = "coach_id"),
            @Result(property = "coachName", column = "coach_name")
    })
    @Select("""
select * from coach where coach_id=#{coachId}
""")
    Coach getCoachById(Integer coachId);


}
