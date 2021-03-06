package club.banyuan.blog.mapper;

import club.banyuan.blog.model.PrestigeFlow;
import club.banyuan.blog.model.PrestigeFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrestigeFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    long countByExample(PrestigeFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int deleteByExample(PrestigeFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int insert(PrestigeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int insertSelective(PrestigeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    List<PrestigeFlow> selectByExample(PrestigeFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    PrestigeFlow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") PrestigeFlow record, @Param("example") PrestigeFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByExample(@Param("record") PrestigeFlow record, @Param("example") PrestigeFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByPrimaryKeySelective(PrestigeFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prestige_flow
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByPrimaryKey(PrestigeFlow record);
}