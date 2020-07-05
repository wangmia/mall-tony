package club.banyuan.blog.model;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.question_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.user_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.created_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.updated_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.content
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table answer
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.id
     *
     * @return the value of answer.id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.id
     *
     * @param id the value for answer.id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.question_id
     *
     * @return the value of answer.question_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.question_id
     *
     * @param questionId the value for answer.question_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.user_id
     *
     * @return the value of answer.user_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.user_id
     *
     * @param userId the value for answer.user_id
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.created_at
     *
     * @return the value of answer.created_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.created_at
     *
     * @param createdAt the value for answer.created_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.updated_at
     *
     * @return the value of answer.updated_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.updated_at
     *
     * @param updatedAt the value for answer.updated_at
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.content
     *
     * @return the value of answer.content
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.content
     *
     * @param content the value for answer.content
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Jun 18 19:03:18 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", userId=").append(userId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}