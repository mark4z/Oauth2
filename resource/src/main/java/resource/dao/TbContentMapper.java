package resource.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import resource.entity.TbContent;
import resource.entity.TbContentExample;
@Mapper
@Repository
public interface TbContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    long countByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int deleteByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int insert(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int insertSelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbg.generated Thu Jun 27 15:17:11 CST 2019
     */
    int updateByPrimaryKey(TbContent record);
}