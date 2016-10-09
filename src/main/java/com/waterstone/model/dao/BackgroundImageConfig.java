package com.waterstone.model.dao;

import java.io.Serializable;

/**
 * 页面中轮询用的图片配置对象.跟轮询组件配合使用,告诉轮询组件如何展现图片.
 * 轮询组件通常会使用本类的一个集合对象.
 * 
 * @author water.stone.
 * @date 2016年10月9日
 * @version 1.0
 */
public class BackgroundImageConfig implements Serializable {
    private static final long serialVersionUID = 8259240920569605849L;
    private Integer id;
    private String imgPath;
    private String imgTitle;
    private Integer imgType;

    /**
     * @return the imgPath
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @param imgPath
     *            the imgPath to set
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * @return the imgTitle
     */
    public String getImgTitle() {
        return imgTitle;
    }

    /**
     * @param imgTitle
     *            the imgTitle to set
     */
    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the imgType
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * @param imgType the imgType to set
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

}
