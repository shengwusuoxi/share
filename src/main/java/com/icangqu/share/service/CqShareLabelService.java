package com.icangqu.share.service;

import com.icangqu.share.dao.*;
import com.icangqu.share.enums.IntBool;
import com.icangqu.share.model.dto.CqShareLabelDto;
import com.icangqu.share.model.dto.CqSimplePublishDto;
import com.icangqu.share.model.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Service("cqShareLabelService")
@Transactional
public class CqShareLabelService {

    @Resource(name="cqUserDAOImpl")
    private CqUserDAO cqUserDAO;

    @Resource(name="cqShareLabelDAOImpl")
    private CqShareLabelDAO cqShareLabelDAO;

    @Resource(name="cqLabelDAOImpl")
    private CqLabelDAO cqLabelDAO;

    @Resource(name="cqPublishDAOImpl")
    private CqPublishDAO cqPublishDAO;

    @Resource(name="cqPublishIncludeImageDAOImpl")
    private CqPublishIncludeImageDAO cqPublishIncludeImageDAO;

    @Resource(name="cqPublishBelongLabelDAOImpl")
    private CqPublishBelongLabelDAO cqPublishBelongLabelDAO;


    public CqShareLabelDto getShareLabelDetailByShareID(String shareId) {
        CqShareLabelDto dto = new CqShareLabelDto();
        CqShareLabel shareLabel = cqShareLabelDAO.getByShareId(shareId);
        if (shareLabel == null || (!IntBool.TRUE.val.equals(shareLabel.getStatus()))) {
            return dto;
        }

        // 获取标签id
        Integer labelId = shareLabel.getId().getLabelId();
        if (labelId == null) {
            return dto;
        }

        // 获取标签基本信息
        CqLabel label = cqLabelDAO.getByLabelId(labelId);
        if(label == null){
            return dto;
        }

        BeanUtils.copyProperties(label,dto);

        //格式話時間
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
        Date date = dto.getCreateDatetime();
        if(dto.getCreateDatetime() != null){
            dto.setCreateDate(myFmt.format(date));
        }

        // 获取标签创建人信息
        Integer userId = dto.getCreatorId();
        CqUser user = cqUserDAO.getByUserId(userId);
        if (user == null) {
            return dto;
        }
        if (!user.getNickName().isEmpty()) {
            dto.setCreatorName(user.getNickName());
        } else {
            dto.setCreatorName(user.getLogname());
        }
        dto.setCreatorPortraitUrl(user.getUserHeaderPortrait());

        // 获取该标签的最新4个发布信息
        List<CqPublishBelongLabel> publishBelongLabelList = cqPublishBelongLabelDAO.getByLabelId(labelId);
        if (publishBelongLabelList == null || publishBelongLabelList.size() <= 0) {
            return null;
        }

        List<CqSimplePublishDto> simplePublishDtoList = new ArrayList<CqSimplePublishDto>();
        for (CqPublishBelongLabel publishBelong : publishBelongLabelList) {
            Integer publishId = publishBelong.getPublishId();
            CqPublish publish = cqPublishDAO.getByPublishId(publishId);
            if (publish == null) {
                continue;
            }

            Integer publishUserId = publish.getUserId();
            CqUser publishUser = cqUserDAO.getByUserId(publishUserId);
            if (publishUser == null) {
                continue;
            }

            CqSimplePublishDto simplePublishDto = new CqSimplePublishDto();

            List<CqPublishIncludeImage> cqPublishIncludeImages = cqPublishIncludeImageDAO.getByPublishId(publishId);
            if (cqPublishIncludeImages != null && cqPublishIncludeImages.size() > 0) {
                simplePublishDto.setPublishImageUrl(cqPublishIncludeImages.get(0).getImageUrl());
            }else{
                continue;
            }

            simplePublishDto.setPublishUserName(publishUser.getNickName());
            simplePublishDto.setPublishUserPortraitUrl(publishUser.getUserHeaderPortrait());
            //格式話時間
            date = publish.getCreateDatetime();
            if(dto.getCreateDatetime() != null){
                simplePublishDto.setPublishDate(myFmt.format(date));
            }
            simplePublishDtoList.add(simplePublishDto);
        }

        dto.setSimplePublishList(simplePublishDtoList);

        return dto;
    }
}
