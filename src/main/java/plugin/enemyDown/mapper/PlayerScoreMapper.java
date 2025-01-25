package plugin.enemyDown.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import plugin.enemyDown.mapper.data.PlayerScore;

public interface PlayerScoreMapper {

  @Select("select * from player_score")
  List<PlayerScore> selectList();
}
