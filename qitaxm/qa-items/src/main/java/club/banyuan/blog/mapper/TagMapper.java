package club.banyuan.blog.mapper;

import club.banyuan.blog.model.Tag;
import club.banyuan.blog.model.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    long countByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int deleteByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int insert(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int insertSelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    List<Tag> selectByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    Tag selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    int updateByPrimaryKey(Tag record);
}